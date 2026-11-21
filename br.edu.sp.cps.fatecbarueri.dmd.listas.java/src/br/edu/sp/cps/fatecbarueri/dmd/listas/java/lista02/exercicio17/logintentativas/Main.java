package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio17.logintentativas;

/*
 * Lista 2 - Exercício 17
 * O usuário tem 3 tentativas de login (admin / 1234). Se errar 3 vezes: "Conta bloqueada".
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";
        boolean acessoPermitido = false;

        for (int tentativa = 1; tentativa <= 3 && !acessoPermitido; tentativa++) {
            System.out.println("Tentativa " + tentativa + " de 3");
            System.out.print("Usuário: ");
            String usuario = sc.nextLine();
            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                acessoPermitido = true;
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Dados incorretos");
            }
        }

        if (!acessoPermitido) {
            System.out.println("Conta bloqueada");
        }

        sc.close();
    }
}
