package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio01.positivonegativozero;

/*
 * Lista 2 - Exercício 1
 * Lê um número inteiro e classifica em Positivo, Negativo ou Zero.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
