package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio06.tabuada;

/*
 * Lista 5 - Exercício 6
 * Tabuada dividida em lerNumero(), mostrarLinha() e exibirTabuada(). Exemplo de linha: 5 x 1 = 5.
 */
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static int lerNumero() {
        System.out.print("Digite um número inteiro: ");
        return scanner.nextInt();
    }

    public static void mostrarLinha(int numero, int multiplicador) {
        System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
    }

    public static void exibirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            mostrarLinha(numero, i);
        }
    }

    public static void main(String[] args) {
        int numero = lerNumero();
        exibirTabuada(numero);

        scanner.close();
    }
}
