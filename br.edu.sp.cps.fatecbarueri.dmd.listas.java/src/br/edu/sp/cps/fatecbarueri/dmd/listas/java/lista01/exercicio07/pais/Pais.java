package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio07.pais;

import java.util.Arrays;

/**
 * Representa um país, com no máximo 40 países vizinhos (fronteiras).
 */
public final class Pais {

    public static final int MAX_VIZINHOS = 40;

    private String codigoIso;
    private String nome;
    private long populacao;
    private double dimensao; // em km2
    private final Pais[] vizinhos = new Pais[MAX_VIZINHOS];
    private int qtdVizinhos = 0;

    public Pais(String codigoIso, String nome, double dimensao) {
        setCodigoIso(codigoIso);
        setNome(nome);
        setDimensao(dimensao);
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        if (codigoIso == null || codigoIso.trim().isEmpty()) {
            throw new IllegalArgumentException("O código ISO não pode ser vazio.");
        }
        this.codigoIso = codigoIso.trim().toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        if (populacao < 0) {
            throw new IllegalArgumentException("A população não pode ser negativa.");
        }
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        if (dimensao <= 0) {
            throw new IllegalArgumentException("A dimensão deve ser maior que zero.");
        }
        this.dimensao = dimensao;
    }

    public int getQtdVizinhos() {
        return qtdVizinhos;
    }

    /**
     * Registra outro país como limítrofe (a relação é registrada nos dois países).
     * Devolve false se o país for nulo, o próprio país, já for vizinho ou se algum
     * dos dois já tiver 40 vizinhos.
     */
    public boolean adicionarVizinho(Pais outro) {
        if (outro == null || this.equals(outro) || ehLimitrofe(outro)) {
            return false;
        }
        if (qtdVizinhos >= MAX_VIZINHOS || outro.qtdVizinhos >= MAX_VIZINHOS) {
            return false;
        }
        this.vizinhos[this.qtdVizinhos++] = outro;
        outro.vizinhos[outro.qtdVizinhos++] = this;
        return true;
    }

    /** Informa se o outro país faz fronteira com este. */
    public boolean ehLimitrofe(Pais outro) {
        if (outro == null) {
            return false;
        }
        for (int i = 0; i < qtdVizinhos; i++) {
            if (vizinhos[i].equals(outro)) {
                return true;
            }
        }
        return false;
    }

    /** Densidade populacional (habitantes por km2). */
    public double densidadePopulacional() {
        return populacao / dimensao;
    }

    /** Array (de tamanho exato) com os vizinhos comuns a este país e ao outro. */
    public Pais[] vizinhosComuns(Pais outro) {
        Pais[] temp = new Pais[MAX_VIZINHOS];
        int qtd = 0;
        for (int i = 0; i < qtdVizinhos; i++) {
            if (outro.ehLimitrofe(vizinhos[i])) {
                temp[qtd++] = vizinhos[i];
            }
        }
        return Arrays.copyOf(temp, qtd);
    }

    /** Dois países são iguais se tiverem o mesmo código ISO. */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return codigoIso.equals(((Pais) obj).codigoIso);
    }

    @Override
    public int hashCode() {
        return codigoIso.hashCode();
    }

    @Override
    public String toString() {
        return nome + " (" + codigoIso + ")";
    }
}
