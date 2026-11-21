package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio07.buscaelemento;

/*
 * Lista 4 - Exercício 7
 * Lê 10 números e um valor X e informa se X está presente no array.
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

        System.out.print("Digite o valor X a procurar: ");
        int x = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < v.length && !encontrado; i++) {
            if (v[i] == x) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Valor " + x + " encontrado no array");
        } else {
            System.out.println("Valor " + x + " não encontrado no array");
        }

        sc.close();
    }
}
