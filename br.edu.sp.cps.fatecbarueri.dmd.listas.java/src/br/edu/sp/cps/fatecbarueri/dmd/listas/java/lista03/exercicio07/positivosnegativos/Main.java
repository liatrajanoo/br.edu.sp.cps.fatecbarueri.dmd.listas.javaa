package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista03.exercicio07.positivosnegativos;

/*
 * Lista 3 - Exercício 7
 * Lê 10 números inteiros e informa quantos são positivos e quantos são negativos
 * (o 0 é considerado neutro).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

        sc.close();
    }
}
