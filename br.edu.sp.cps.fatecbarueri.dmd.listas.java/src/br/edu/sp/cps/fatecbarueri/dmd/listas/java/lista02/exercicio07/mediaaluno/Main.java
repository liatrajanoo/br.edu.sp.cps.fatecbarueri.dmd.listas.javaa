package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio07.mediaaluno;

/*
 * Lista 2 - Exercício 7
 * Lê duas notas, calcula a média e classifica: Aprovado (>= 6), Recuperação
 * (4 <= média < 6) ou Reprovado (< 4).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

        if (media >= 6) {
            System.out.println("Aprovado");
        } else if (media >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
