package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio11.calculadora;

/*
 * Lista 2 - Exercício 11
 * Lê dois números e uma operação (+, -, *, /) e executa com switch (trata divisão por zero).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Resultado: " + (a + b));
                break;
            case '-':
                System.out.println("Resultado: " + (a - b));
                break;
            case '*':
                System.out.println("Resultado: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Resultado: " + (a / b));
                } else {
                    System.out.println("Divisão por zero não é permitida");
                }
                break;
            default:
                System.out.println("Operação inválida");
        }

        sc.close();
    }
}
