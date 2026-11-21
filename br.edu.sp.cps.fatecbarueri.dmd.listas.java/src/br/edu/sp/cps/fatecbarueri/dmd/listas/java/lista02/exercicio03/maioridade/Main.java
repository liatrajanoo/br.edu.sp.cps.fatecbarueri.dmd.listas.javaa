package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio03.maioridade;

/*
 * Lista 2 - Exercício 3
 * Lê a idade e informa: Maior de idade (>= 18) ou Menor de idade (< 18).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        sc.close();
    }
}
