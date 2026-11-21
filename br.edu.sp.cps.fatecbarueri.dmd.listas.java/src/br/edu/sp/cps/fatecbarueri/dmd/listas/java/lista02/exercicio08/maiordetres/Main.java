package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio08.maiordetres;

/*
 * Lista 2 - Exercício 8
 * Lê três números e informa qual é o maior (comparando progressivamente).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        int maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}
