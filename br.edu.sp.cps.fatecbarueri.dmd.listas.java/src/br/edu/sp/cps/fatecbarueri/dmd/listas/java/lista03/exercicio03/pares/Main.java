package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista03.exercicio03.pares;

/*
 * Lista 3 - Exercício 3
 * Exibe todos os números pares de 1 até 50.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
