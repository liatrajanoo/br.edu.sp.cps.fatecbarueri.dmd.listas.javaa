package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio05.contagempares;

/*
 * Lista 4 - Exercício 5
 * Lê 10 números e informa quantos são pares.
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

        int pares = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);

        sc.close();
    }
}
