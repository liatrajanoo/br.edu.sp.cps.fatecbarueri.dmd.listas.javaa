package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio08.contagemocorrencias;

/*
 * Lista 4 - Exercício 8
 * Lê 10 números e um valor X e informa quantas vezes X aparece no array.
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

        System.out.print("Digite o valor X a contar: ");
        int x = sc.nextInt();

        int ocorrencias = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                ocorrencias++;
            }
        }

        System.out.println("O valor " + x + " aparece " + ocorrencias + " vez(es)");

        sc.close();
    }
}
