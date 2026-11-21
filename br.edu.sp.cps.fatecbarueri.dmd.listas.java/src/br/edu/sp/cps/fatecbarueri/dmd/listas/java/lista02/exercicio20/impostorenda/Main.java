package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio20.impostorenda;

/*
 * Lista 2 - Exercício 20
 * Lê o salário e calcula o imposto: até 2000 Isento; de 2001 a 5000, 10%; acima de 5000, 20%.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        if (salario < 0) {
            System.out.println("Salário inválido: não pode ser negativo");
        } else {
            double imposto;
            if (salario <= 2000) {
                imposto = 0;
                System.out.println("Faixa: Isento");
            } else if (salario <= 5000) {
                imposto = salario * 0.10;
                System.out.println("Faixa: 10%");
            } else {
                imposto = salario * 0.20;
                System.out.println("Faixa: 20%");
            }
            System.out.printf("Imposto: R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
