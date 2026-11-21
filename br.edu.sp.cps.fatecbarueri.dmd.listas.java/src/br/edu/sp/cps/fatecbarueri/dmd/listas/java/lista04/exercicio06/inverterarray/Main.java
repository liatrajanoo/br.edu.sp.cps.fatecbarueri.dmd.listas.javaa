package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio06.inverterarray;

/*
 * Lista 4 - Exercício 6
 * Lê 5 números e exibe o array na ordem inversa.
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

        System.out.println("Array na ordem inversa:");
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.println(v[i]);
        }

        sc.close();
    }
}
