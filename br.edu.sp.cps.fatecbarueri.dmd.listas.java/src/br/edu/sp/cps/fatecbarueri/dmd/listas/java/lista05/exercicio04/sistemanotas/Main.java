package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio04.sistemanotas;

/*
 * Lista 5 - Exercício 4
 * Sistema que lê 3 notas, calcula a média, verifica a situação e mostra o resultado,
 * dividido em lerNota(), calcularMedia(), verificarSituacao() e mostrarResultado().
 */
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static double lerNota(int numero) {
        double nota;
        do {
            System.out.print("Digite a nota " + numero + " (0 a 10): ");
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 10);
        return nota;
    }

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static String verificarSituacao(double media) {
        if (media >= 6) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Recuperação";
        }
        return "Reprovado";
    }

    public static void mostrarResultado(double media, String situacao) {
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Situação: " + situacao);
    }

    public static void main(String[] args) {
        double nota1 = lerNota(1);
        double nota2 = lerNota(2);
        double nota3 = lerNota(3);

        double media = calcularMedia(nota1, nota2, nota3);
        String situacao = verificarSituacao(media);
        mostrarResultado(media, situacao);

        scanner.close();
    }
}
