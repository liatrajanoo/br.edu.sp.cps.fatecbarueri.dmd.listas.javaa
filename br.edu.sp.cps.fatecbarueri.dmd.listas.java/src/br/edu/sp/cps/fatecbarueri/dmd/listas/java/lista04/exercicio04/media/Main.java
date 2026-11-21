package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio04.media;

/*
 * Lista 4 - Exercício 4
 * Lê 6 números e calcula a média.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] v = new double[6];
        double soma = 0;

        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            v[i] = sc.nextDouble();
            soma += v[i];
        }

        System.out.println("Média: " + (soma / v.length));

        sc.close();
    }
}
