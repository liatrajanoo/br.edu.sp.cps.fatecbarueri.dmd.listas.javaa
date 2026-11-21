package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio09.ordenacao;

/*
 * Lista 4 - Exercício 9
 * Lê 10 números e ordena em ordem crescente (método da bolha).
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

        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }

        System.out.println("Array em ordem crescente:");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        sc.close();
    }
}
