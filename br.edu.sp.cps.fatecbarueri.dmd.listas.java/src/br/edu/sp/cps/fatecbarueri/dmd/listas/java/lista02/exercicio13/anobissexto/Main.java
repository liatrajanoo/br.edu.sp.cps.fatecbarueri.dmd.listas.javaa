package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio13.anobissexto;

/*
 * Lista 2 - Exercício 13
 * Lê um ano e informa se é bissexto (divisível por 4 e não por 100, OU divisível por 400).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }

        sc.close();
    }
}
