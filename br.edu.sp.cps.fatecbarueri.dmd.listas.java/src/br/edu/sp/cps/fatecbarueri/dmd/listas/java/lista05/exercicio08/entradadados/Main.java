package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio08.entradadados;

/*
 * Lista 5 - Exercício 8
 * Pede nome, idade e cidade com lerNome(), lerIdade(), lerCidade() e mostrarResumo().
 */
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine().trim();
    }

    public static String lerNome() {
        return lerTexto("Digite o nome: ");
    }

    public static int lerIdade() {
        int idade = -1;
        while (idade < 0) {
            try {
                idade = Integer.parseInt(lerTexto("Digite a idade: "));
            } catch (NumberFormatException e) {
                idade = -1;
            }
            if (idade < 0) {
                System.out.println("Idade inválida. Digite um número inteiro não negativo.");
            }
        }
        return idade;
    }

    public static String lerCidade() {
        return lerTexto("Digite a cidade: ");
    }

    public static void mostrarResumo(String nome, int idade, String cidade) {
        System.out.println("\n===== RESUMO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }

    public static void main(String[] args) {
        String nome = lerNome();
        int idade = lerIdade();
        String cidade = lerCidade();

        mostrarResumo(nome, idade, cidade);

        scanner.close();
    }
}
