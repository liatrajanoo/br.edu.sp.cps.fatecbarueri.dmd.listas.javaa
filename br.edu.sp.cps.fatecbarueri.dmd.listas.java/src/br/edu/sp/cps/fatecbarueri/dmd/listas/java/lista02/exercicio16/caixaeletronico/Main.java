package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio16.caixaeletronico;

/*
 * Lista 2 - Exercício 16
 * Lê um valor inteiro e calcula a quantidade mínima de notas de 100, 50, 20, 10, 5, 2 e 1.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = sc.nextInt();

        if (valor < 0) {
            System.out.println("Valor inválido: não pode ser negativo");
        } else {
            int n100 = valor / 100;
            valor = valor % 100;

            int n50 = valor / 50;
            valor = valor % 50;

            int n20 = valor / 20;
            valor = valor % 20;

            int n10 = valor / 10;
            valor = valor % 10;

            int n5 = valor / 5;
            valor = valor % 5;

            int n2 = valor / 2;
            valor = valor % 2;

            int n1 = valor;

            System.out.println("Notas de 100: " + n100);
            System.out.println("Notas de 50: " + n50);
            System.out.println("Notas de 20: " + n20);
            System.out.println("Notas de 10: " + n10);
            System.out.println("Notas de 5: " + n5);
            System.out.println("Notas de 2: " + n2);
            System.out.println("Notas de 1: " + n1);
        }

        sc.close();
    }
}
