package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista03.exercicio10.somaatezero;

/*
 * Lista 3 - Exercício 10
 * Lê números até o usuário digitar 0 e exibe a soma total.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número ou 0 para sair: ");
            numero = sc.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("Soma total: " + soma);

        sc.close();
    }
}
