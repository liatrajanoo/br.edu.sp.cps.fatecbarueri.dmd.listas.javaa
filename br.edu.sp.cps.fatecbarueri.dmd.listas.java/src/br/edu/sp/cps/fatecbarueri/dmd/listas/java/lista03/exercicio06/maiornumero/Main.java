package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista03.exercicio06.maiornumero;

/*
 * Lista 3 - Exercício 6
 * Lê 5 números inteiros e informa o maior.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Maior número: " + maior);

        sc.close();
    }
}
