package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio10.conjunto;

import java.util.Arrays;

/**
 * Conjunto de Strings de tamanho variável (o array interno cresce por demanda).
 */
public class Conjunto {

    private static final int CAPACIDADE_INICIAL = 4;

    private String[] elementos = new String[CAPACIDADE_INICIAL];
    private int tamanho = 0;

    public int tamanho() {
        return tamanho;
    }

    public String get(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
        return elementos[indice];
    }

    /**
     * Adiciona um elemento. Devolve false (e não altera o conjunto) se o elemento
     * for null ou já existir.
     */
    public boolean adicionar(String elemento) {
        if (elemento == null || pertence(elemento)) {
            return false;
        }
        if (tamanho == elementos.length) {
            elementos = Arrays.copyOf(elementos, elementos.length * 2);
        }
        elementos[tamanho++] = elemento;
        return true;
    }

    /** Verifica se o elemento pertence ao conjunto. */
    public boolean pertence(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    /** União: novo conjunto com os elementos dos dois conjuntos, sem repetições. */
    public Conjunto uniao(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < tamanho; i++) {
            resultado.adicionar(elementos[i]);
        }
        for (int i = 0; i < outro.tamanho; i++) {
            resultado.adicionar(outro.elementos[i]);
        }
        return resultado;
    }

    /** Interseção: novo conjunto com os elementos presentes nos dois conjuntos. */
    public Conjunto inter(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < tamanho; i++) {
            if (outro.pertence(elementos[i])) {
                resultado.adicionar(elementos[i]);
            }
        }
        return resultado;
    }

    /** Subtração: novo conjunto com os elementos deste que não estão no outro. */
    public Conjunto menos(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (int i = 0; i < tamanho; i++) {
            if (!outro.pertence(elementos[i])) {
                resultado.adicionar(elementos[i]);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < tamanho; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(elementos[i]);
        }
        return sb.append("}").toString();
    }
}
