package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio03.separandovalidacao;

/*
 * Lista 5 - Exercício 3
 * Verifica se um número é par, dividido em lerNumero(), ehPar() e mostrarResultado().
 */
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static int lerNumero() {
        System.out.print("Digite um número inteiro: ");
        return scanner.nextInt();
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void mostrarResultado(int numero, boolean par) {
        if (par) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }
    }

    public static void main(String[] args) {
        int numero = lerNumero();
        boolean par = ehPar(numero);
        mostrarResultado(numero, par);

        scanner.close();
    }
}
