package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio02.parimpar;

/*
 * Lista 2 - Exercício 2
 * Lê um número inteiro e informa se é Par ou Ímpar (usa o operador %).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        sc.close();
    }
}
