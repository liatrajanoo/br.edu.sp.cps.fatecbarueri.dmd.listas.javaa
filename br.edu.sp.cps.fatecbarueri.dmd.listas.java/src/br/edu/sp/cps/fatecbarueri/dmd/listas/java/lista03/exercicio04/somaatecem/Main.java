package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista03.exercicio04.somaatecem;

/*
 * Lista 3 - Exercício 4
 * Calcula e exibe a soma dos números de 1 até 100.
 */
public class Main {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("Soma: " + soma);
    }
}
