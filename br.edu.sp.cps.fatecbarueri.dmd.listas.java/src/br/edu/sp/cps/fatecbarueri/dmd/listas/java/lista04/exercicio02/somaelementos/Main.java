package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio02.somaelementos;

/*
 * Lista 4 - Exercício 2
 * Lê 10 números e calcula a soma de todos os elementos do array.
 */
import java.util.Scanner;

public class Main {
    private static int[] lerVetor(Scanner sc, int tamanho) {
        int[] v = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            v[i] = sc.nextInt();
        }
        return v;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = lerVetor(sc, 10);

        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }

        System.out.println("Soma dos elementos: " + soma);

        sc.close();
    }
}
