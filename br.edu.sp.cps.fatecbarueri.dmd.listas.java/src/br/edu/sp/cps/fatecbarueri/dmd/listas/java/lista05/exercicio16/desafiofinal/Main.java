package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio16.desafiofinal;

/*
 * Lista 5 - Desafio Final
 * ANTES: o mini-sistema da Lista 2 (exercício 21) tinha login, menu, depósito, saque e saldo
 * tudo dentro do main (cerca de 80 linhas, com switch aninhado e entradas repetidas).
 * DEPOIS: a mesma lógica dividida em funções pequenas, cada uma com uma responsabilidade;
 * o main apenas controla o fluxo.
 */
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final String USUARIO_CORRETO = "admin";
    private static final String SENHA_CORRETA = "1234";
    private static final int OPCAO_SAIR = 4;
    private static double saldo = 1000.0;

    // ---------- entrada de dados ----------
    public static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    public static double lerValor(String mensagem) {
        System.out.print(mensagem);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    // ---------- login ----------
    public static boolean validarLogin(String usuario, String senha) {
        return USUARIO_CORRETO.equals(usuario) && SENHA_CORRETA.equals(senha);
    }

    public static boolean fazerLogin() {
        String usuario = lerTexto("Usuário: ");
        String senha = lerTexto("Senha: ");
        boolean valido = validarLogin(usuario, senha);
        if (!valido) {
            System.out.println("Login inválido");
        }
        return valido;
    }

    // ---------- regras de negócio ----------
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

    // ---------- saída de dados ----------
    public static void mostrarMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
    }

    public static void mostrarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public static void mostrarResultadoOperacao(boolean sucesso, String mensagemSucesso, String mensagemErro) {
        System.out.println(sucesso ? mensagemSucesso : mensagemErro);
    }

    // ---------- fluxo do menu ----------
    public static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                mostrarSaldo();
                break;
            case 2:
                mostrarResultadoOperacao(depositar(lerValor("Digite o valor do depósito: ")),
                        "Depósito realizado com sucesso", "Valor inválido");
                break;
            case 3:
                mostrarResultadoOperacao(sacar(lerValor("Digite o valor do saque: ")),
                        "Saque realizado com sucesso", "Valor inválido ou saldo insuficiente");
                break;
            case OPCAO_SAIR:
                System.out.println("Sistema encerrado");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public static void main(String[] args) {
        if (fazerLogin()) {
            int opcao;
            do {
                mostrarMenu();
                opcao = lerInteiro("Escolha uma opção: ");
                executarOpcao(opcao);
            } while (opcao != OPCAO_SAIR);
        }

        scanner.close();
    }
}
