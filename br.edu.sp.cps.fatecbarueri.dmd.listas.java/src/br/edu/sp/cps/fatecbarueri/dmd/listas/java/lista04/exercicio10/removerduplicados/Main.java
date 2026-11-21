package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio10.removerduplicados;

/*
 * Lista 4 - Exercício 10
 * Lê 10 números e exibe apenas uma vez cada valor (sem repetições).
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

        System.out.println("Valores sem repetição:");
        for (int i = 0; i < v.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < i && !repetido; j++) {
                if (v[i] == v[j]) {
                    repetido = true;
                }
            }
            if (!repetido) {
                System.out.println(v[i]);
            }
        }

        sc.close();
    }
}
