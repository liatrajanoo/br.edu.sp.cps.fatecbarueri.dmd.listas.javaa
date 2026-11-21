package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio03.maiormenor;

/*
 * Lista 4 - Exercício 3
 * Lê 8 números e informa o maior e o menor valor.
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

        int[] v = lerVetor(sc, 8);

        int maior = v[0];
        int menor = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
            if (v[i] < menor) {
                menor = v[i];
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}
