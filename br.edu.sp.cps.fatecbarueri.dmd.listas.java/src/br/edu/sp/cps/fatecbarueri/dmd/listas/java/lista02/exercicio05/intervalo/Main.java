package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio05.intervalo;

/*
 * Lista 2 - Exercício 5
 * Lê um número e verifica se está entre 10 e 50 (inclusive) ou fora do intervalo (usa &&).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero >= 10 && numero <= 50) {
            System.out.println("Está entre 10 e 50");
        } else {
            System.out.println("Está fora do intervalo");
        }

        sc.close();
    }
}
