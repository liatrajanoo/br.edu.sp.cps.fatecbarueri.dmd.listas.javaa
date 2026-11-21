package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista03.exercicio05.tabuada;

/*
 * Lista 3 - Exercício 5
 * Pede um número inteiro e exibe a tabuada dele de 1 até 10.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}
