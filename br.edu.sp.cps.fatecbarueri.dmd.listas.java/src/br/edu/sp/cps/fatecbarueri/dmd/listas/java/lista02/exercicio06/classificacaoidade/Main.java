package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio06.classificacaoidade;

/*
 * Lista 2 - Exercício 6
 * Classifica pela idade: Criança (0 a 12), Adolescente (13 a 17), Adulto (18 a 59) e
 * Idoso (60 ou mais). Idade negativa é rejeitada.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida: não pode ser negativa");
        } else if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        sc.close();
    }
}
