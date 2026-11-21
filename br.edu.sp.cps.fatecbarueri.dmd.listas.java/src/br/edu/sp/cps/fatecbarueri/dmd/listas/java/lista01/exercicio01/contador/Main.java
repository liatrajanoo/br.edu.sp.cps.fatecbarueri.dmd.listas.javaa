package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio01.contador;

/*
 * Lista 1 - Exercício 1
 * Classe Contador que encapsula um valor usado para contagem, com métodos para:
 * a) zerar; b) incrementar; c) retornar o valor do contador.
 */
public class Main {
    public static void main(String[] args) {
        Contador c = new Contador();
        System.out.println("Valor inicial: " + c.getValor());

        for (int i = 0; i < 5; i++) {
            c.incrementar();
        }
        System.out.println("Após 5 incrementos: " + c.getValor());

        c.zerar();
        System.out.println("Após zerar: " + c.getValor());

        c.incrementar();
        c.incrementar();
        System.out.println("Após mais 2 incrementos: " + c.getValor());
        System.out.println(c);
    }
}
