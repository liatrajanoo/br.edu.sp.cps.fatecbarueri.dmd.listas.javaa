package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista03.exercicio09.fatorial;

/*
 * Lista 3 - Exercício 9
 * Pede um número inteiro positivo e calcula o fatorial (ex.: 5! = 120). Usa long e rejeita
 * número negativo; acima de 20 o resultado não cabe em long.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido: o fatorial não existe para negativos");
        } else if (numero > 20) {
            System.out.println("Número muito grande: 20 é o maior fatorial que cabe em um long");
        } else {
            long fatorial = 1;

            for (int i = numero; i >= 1; i--) {
                fatorial *= i;
            }

            System.out.println(numero + "! = " + fatorial);
        }

        sc.close();
    }
}
