package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio05.calculadora;

/*
 * Lista 5 - Exercício 5
 * Calculadora em que o main não faz contas: mostrarMenu(), somar(), subtrair(),
 * multiplicar(), dividir() e lerNumero(). O main apenas controla o fluxo.
 */
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final int SAIR = 0;

    public static void mostrarMenu() {
        System.out.println("\n===== CALCULADORA =====");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
    }

    public static int lerOpcao() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public static double lerNumero(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static boolean ehOpcaoValida(int opcao) {
        return opcao >= 1 && opcao <= 4;
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static double calcular(int opcao, double a, double b) {
        switch (opcao) {
            case 1:
                return somar(a, b);
            case 2:
                return subtrair(a, b);
            case 3:
                return multiplicar(a, b);
            default:
                return dividir(a, b);
        }
    }

    public static void executarOperacao(int opcao) {
        double a = lerNumero("Digite o primeiro número: ");
        double b = lerNumero("Digite o segundo número: ");

        if (opcao == 4 && b == 0) {
            System.out.println("Divisão por zero não é permitida.");
        } else {
            System.out.println("Resultado: " + calcular(opcao, a, b));
        }
    }

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = lerOpcao();

            if (opcao == SAIR) {
                System.out.println("Encerrando a calculadora...");
            } else if (!ehOpcaoValida(opcao)) {
                System.out.println("Opção inválida.");
            } else {
                executarOperacao(opcao);
            }
        } while (opcao != SAIR);

        scanner.close();
    }
}
