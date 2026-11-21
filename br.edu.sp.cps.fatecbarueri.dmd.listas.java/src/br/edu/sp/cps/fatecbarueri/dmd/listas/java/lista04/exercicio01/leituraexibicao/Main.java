package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio01.leituraexibicao;

/*
 * Lista 4 - Exercício 1
 * Lê 5 números inteiros, guarda em um array e exibe todos os valores.
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

        int[] v = lerVetor(sc, 5);

        System.out.println("Valores digitados:");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        sc.close();
    }
}
