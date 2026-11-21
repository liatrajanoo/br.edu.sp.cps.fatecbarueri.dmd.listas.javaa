package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio10.login;

/*
 * Lista 5 - Exercício 10
 * Login separado em lerUsuario(), lerSenha(), validarLogin() e mostrarResultado(), com até
 * 3 tentativas (usuário admin, senha 1234).
 */
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final String USUARIO_CORRETO = "admin";
    private static final String SENHA_CORRETA = "1234";
    private static final int MAX_TENTATIVAS = 3;

    public static String lerUsuario() {
        System.out.print("Usuário: ");
        return scanner.nextLine();
    }

    public static String lerSenha() {
        System.out.print("Senha: ");
        return scanner.nextLine();
    }

    public static boolean validarLogin(String usuario, String senha) {
        return USUARIO_CORRETO.equals(usuario) && SENHA_CORRETA.equals(senha);
    }

    public static void mostrarResultado(boolean autenticado, int tentativa) {
        if (autenticado) {
            System.out.println("Acesso permitido");
        } else if (tentativa >= MAX_TENTATIVAS) {
            System.out.println("Conta bloqueada");
        } else {
            System.out.println("Dados incorretos. Tentativas restantes: " + (MAX_TENTATIVAS - tentativa));
        }
    }

    public static void main(String[] args) {
        boolean autenticado = false;
        int tentativa = 0;

        while (!autenticado && tentativa < MAX_TENTATIVAS) {
            tentativa++;
            String usuario = lerUsuario();
            String senha = lerSenha();
            autenticado = validarLogin(usuario, senha);
            mostrarResultado(autenticado, tentativa);
        }

        scanner.close();
    }
}
