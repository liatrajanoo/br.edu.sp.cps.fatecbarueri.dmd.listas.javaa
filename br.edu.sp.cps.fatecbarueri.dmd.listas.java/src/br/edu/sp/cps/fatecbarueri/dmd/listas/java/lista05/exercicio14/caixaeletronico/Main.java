package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio14.caixaeletronico;

/*
 * Lista 5 - Exercício 14
 * Caixa eletrônico com mostrarMenu(), depositar(), sacar(), consultarSaldo() e
 * encerrarSistema(). O menu repete até o usuário escolher sair.
 */
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final int OPCAO_SAIR = 4;
    private static double saldo = 500;

    public static void mostrarMenu() {
        System.out.println("\n===== CAIXA ELETRÔNICO =====");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
    }

    public static int lerOpcao() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public static double lerValor(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static double consultarSaldo() {
        return saldo;
    }

    public static boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo += valor;
        return true;
    }

    public static boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    public static void mostrarSaldo() {
        System.out.printf("Saldo disponível: R$ %.2f%n", consultarSaldo());
    }

    public static void mostrarResultadoOperacao(boolean sucesso, String mensagemSucesso, String mensagemErro) {
        System.out.println(sucesso ? mensagemSucesso : mensagemErro);
    }

    public static void encerrarSistema() {
        mostrarSaldo();
        System.out.println("Obrigado por usar o caixa eletrônico. Até logo!");
        scanner.close();
    }

    public static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                mostrarSaldo();
                break;
            case 2:
                mostrarResultadoOperacao(depositar(lerValor("Valor do depósito: R$ ")),
                        "Depósito realizado!", "Valor inválido para depósito.");
                break;
            case 3:
                mostrarResultadoOperacao(sacar(lerValor("Valor do saque: R$ ")),
                        "Saque realizado!", "Valor inválido ou saldo insuficiente.");
                break;
            case OPCAO_SAIR:
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = lerOpcao();
            executarOpcao(opcao);
        } while (opcao != OPCAO_SAIR);

        encerrarSistema();
    }
}
