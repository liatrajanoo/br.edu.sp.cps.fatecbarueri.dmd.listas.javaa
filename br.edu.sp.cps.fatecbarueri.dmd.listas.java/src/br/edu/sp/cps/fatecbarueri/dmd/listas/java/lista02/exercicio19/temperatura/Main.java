package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio19.temperatura;

/*
 * Lista 2 - Exercício 19
 * Lê a temperatura: < 15 Frio; de 15 a 25 Agradável; acima de 25 Quente.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temp = sc.nextDouble();

        if (temp < 15) {
            System.out.println("Frio");
        } else if (temp <= 25) {
            System.out.println("Agradável");
        } else {
            System.out.println("Quente");
        }

        sc.close();
    }
}
