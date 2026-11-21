package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio10.descontocompra;

/*
 * Lista 2 - Exercício 10
 * Lê o valor da compra: >= 100 tem 10% de desconto; < 100 não tem. Exibe o valor final.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        double valorFinal;
        if (valor >= 100) {
            valorFinal = valor * 0.9;
        } else {
            valorFinal = valor;
        }

        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        sc.close();
    }
}
