package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio11.matriz;

import java.util.Arrays;

/**
 * Representa uma matriz matemática de números reais.
 */
public class Matriz {

    private static final double TOLERANCIA = 1e-9;

    private double[][] dados;

    /** Cria uma matriz linhas x colunas com todos os elementos iguais a 0. */
    public Matriz(int linhas, int colunas) {
        if (linhas <= 0 || colunas <= 0) {
            throw new IllegalArgumentException("As dimensões da matriz devem ser maiores que zero.");
        }
        this.dados = new double[linhas][colunas];
    }

    public int getLinhas() {
        return dados.length;
    }

    public int getColunas() {
        return dados[0].length;
    }

    /** Lê o elemento da posição (linha, coluna), com índices começando em 0. */
    public double get(int linha, int coluna) {
        validarPosicao(linha, coluna);
        return dados[linha][coluna];
    }

    /** Escreve o elemento da posição (linha, coluna), com índices começando em 0. */
    public void set(int linha, int coluna, double valor) {
        validarPosicao(linha, coluna);
        dados[linha][coluna] = valor;
    }

    private void validarPosicao(int linha, int coluna) {
        if (linha < 0 || linha >= getLinhas() || coluna < 0 || coluna >= getColunas()) {
            throw new IndexOutOfBoundsException("Posição inválida: (" + linha + ", " + coluna + ")");
        }
    }

    private boolean ehQuadrada() {
        return getLinhas() == getColunas();
    }

    /** Comparação semântica: mesmas dimensões e mesmos elementos. */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Matriz outra = (Matriz) obj;
        if (getLinhas() != outra.getLinhas() || getColunas() != outra.getColunas()) {
            return false;
        }
        for (int i = 0; i < getLinhas(); i++) {
            for (int j = 0; j < getColunas(); j++) {
                // "+ 0.0" faz com que -0.0 seja tratado como 0.0
                if (Double.compare(dados[i][j] + 0.0, outra.dados[i][j] + 0.0) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int h = 17;
        for (double[] linha : dados) {
            for (double v : linha) {
                h = 31 * h + Double.hashCode(v + 0.0);
            }
        }
        return h;
    }

    /** Retorna a transposta: linhas viram colunas e colunas viram linhas. */
    public Matriz transposta() {
        Matriz t = new Matriz(getColunas(), getLinhas());
        for (int i = 0; i < getLinhas(); i++) {
            for (int j = 0; j < getColunas(); j++) {
                t.dados[j][i] = dados[i][j];
            }
        }
        return t;
    }

    /** Retorna a oposta: todos os elementos com o sinal trocado. */
    public Matriz oposta() {
        Matriz o = new Matriz(getLinhas(), getColunas());
        for (int i = 0; i < getLinhas(); i++) {
            for (int j = 0; j < getColunas(); j++) {
                o.dados[i][j] = 0.0 - dados[i][j];
            }
        }
        return o;
    }

    /** Gera uma matriz nula (todos os elementos 0) com as mesmas dimensões desta. */
    public Matriz gerarNula() {
        return new Matriz(getLinhas(), getColunas());
    }

    /** Identidade: quadrada, diagonal principal toda 1 e os demais elementos 0. */
    public boolean ehIdentidade() {
        if (!ehDiagonal()) {
            return false;
        }
        for (int i = 0; i < getLinhas(); i++) {
            if (Math.abs(dados[i][i] - 1) > TOLERANCIA) {
                return false;
            }
        }
        return true;
    }

    /** Diagonal: quadrada e com todos os elementos fora da diagonal principal iguais a 0. */
    public boolean ehDiagonal() {
        if (!ehQuadrada()) {
            return false;
        }
        for (int i = 0; i < getLinhas(); i++) {
            for (int j = 0; j < getColunas(); j++) {
                if (i != j && Math.abs(dados[i][j]) > TOLERANCIA) {
                    return false;
                }
            }
        }
        return true;
    }

    /** "Singular" (definição do enunciado): matriz diagonal com a diagonal principal toda igual. */
    public boolean ehSingular() {
        if (!ehDiagonal()) {
            return false;
        }
        for (int i = 1; i < getLinhas(); i++) {
            if (Math.abs(dados[i][i] - dados[0][0]) > TOLERANCIA) {
                return false;
            }
        }
        return true;
    }

    /** Simétrica: quadrada e igual à sua transposta. */
    public boolean ehSimetrica() {
        return ehQuadrada() && this.equals(this.transposta());
    }

    /** Anti-simétrica: quadrada e com a oposta igual à transposta. */
    public boolean ehAntiSimetrica() {
        return ehQuadrada() && this.oposta().equals(this.transposta());
    }

    /** Soma a matriz recebida a esta (altera esta matriz). */
    public void somar(Matriz outra) {
        validarMesmasDimensoes(outra, "somar");
        for (int i = 0; i < getLinhas(); i++) {
            for (int j = 0; j < getColunas(); j++) {
                dados[i][j] += outra.dados[i][j];
            }
        }
    }

    /** Subtrai a matriz recebida desta (altera esta matriz). */
    public void subtrair(Matriz outra) {
        validarMesmasDimensoes(outra, "subtrair");
        for (int i = 0; i < getLinhas(); i++) {
            for (int j = 0; j < getColunas(); j++) {
                dados[i][j] -= outra.dados[i][j];
            }
        }
    }

    private void validarMesmasDimensoes(Matriz outra, String operacao) {
        if (getLinhas() != outra.getLinhas() || getColunas() != outra.getColunas()) {
            throw new IllegalArgumentException("Não é possível " + operacao
                    + " matrizes de dimensões diferentes: " + getLinhas() + "x" + getColunas()
                    + " e " + outra.getLinhas() + "x" + outra.getColunas() + ".");
        }
    }

    /**
     * Multiplica esta matriz (m x n) pela matriz recebida (n x p). Esta matriz passa a
     * guardar o resultado (m x p). Lança IllegalArgumentException se n for diferente.
     */
    public void multiplicar(Matriz outra) {
        if (getColunas() != outra.getLinhas()) {
            throw new IllegalArgumentException("Não é possível multiplicar: o número de colunas ("
                    + getColunas() + ") deve ser igual ao número de linhas da outra matriz ("
                    + outra.getLinhas() + ").");
        }
        double[][] resultado = new double[getLinhas()][outra.getColunas()];
        for (int i = 0; i < getLinhas(); i++) {
            for (int j = 0; j < outra.getColunas(); j++) {
                double soma = 0;
                for (int k = 0; k < getColunas(); k++) {
                    soma += dados[i][k] * outra.dados[k][j];
                }
                resultado[i][j] = soma;
            }
        }
        this.dados = resultado;
    }

    /** Gera uma cópia da matriz (novo objeto com os mesmos elementos). */
    @Override
    public Matriz clone() {
        Matriz copia = new Matriz(getLinhas(), getColunas());
        for (int i = 0; i < getLinhas(); i++) {
            copia.dados[i] = Arrays.copyOf(dados[i], dados[i].length);
        }
        return copia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getLinhas(); i++) {
            sb.append("[");
            for (int j = 0; j < getColunas(); j++) {
                if (j > 0) {
                    sb.append("  ");
                }
                sb.append(dados[i][j]);
            }
            sb.append("]");
            if (i < getLinhas() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
