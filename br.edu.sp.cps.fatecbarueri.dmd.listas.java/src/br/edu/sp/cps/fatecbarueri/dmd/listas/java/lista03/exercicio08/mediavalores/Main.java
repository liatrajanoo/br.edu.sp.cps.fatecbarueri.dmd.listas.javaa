package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista03.exercicio08.mediavalores;

/*
 * Lista 3 - Exercício 8
 * Pergunta quantos números serão informados e calcula a média (quantidade deve ser maior
 * que zero, para evitar divisão por zero).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja informar? ");
        int quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero");
        } else {
            double soma = 0;

            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Digite o " + i + "º número: ");
                double numero = sc.nextDouble();
                soma += numero;
            }

            double media = soma / quantidade;
            System.out.println("Média: " + media);
        }

        sc.close();
    }
}
