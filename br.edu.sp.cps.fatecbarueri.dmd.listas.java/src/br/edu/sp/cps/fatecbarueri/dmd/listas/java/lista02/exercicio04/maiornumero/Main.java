package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio04.maiornumero;

/*
 * Lista 2 - Exercício 4
 * Lê dois números e informa qual é o maior (trata também o caso de empate).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("O maior número é: " + a);
        } else if (b > a) {
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("Os números são iguais");
        }

        sc.close();
    }
}
