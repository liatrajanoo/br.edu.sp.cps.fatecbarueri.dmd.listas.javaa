package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio18.menuinterativo;

/*
 * Lista 2 - Exercício 18
 * Menu 1 - Somar, 2 - Subtrair, 3 - Sair, com switch; repete até o usuário escolher sair.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    int a = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int b = sc.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    int x = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int y = sc.nextInt();
                    System.out.println("Resultado: " + (x - y));
                    break;
                case 3:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 3);

        sc.close();
    }
}
