package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio12.diasemana;

/*
 * Lista 2 - Exercício 12
 * Lê um número de 1 a 7 e exibe o dia da semana (1 = Domingo ... 7 = Sábado); outro valor é erro.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Erro: número inválido (use de 1 a 7)");
        }

        sc.close();
    }
}
