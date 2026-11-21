package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio01.contador;

/**
 * Encapsula um valor usado para contagem de itens ou eventos.
 */
public class Contador {

    private int valor;

    /** Cria um contador zerado. */
    public Contador() {
        this.valor = 0;
    }

    /** Zera o contador. */
    public void zerar() {
        valor = 0;
    }

    /** Incrementa o contador em uma unidade. */
    public void incrementar() {
        valor++;
    }

    /** Retorna o valor atual do contador. */
    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Contador[" + valor + "]";
    }
}
