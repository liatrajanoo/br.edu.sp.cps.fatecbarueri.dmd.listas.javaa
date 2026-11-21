package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio15.imc;

/*
 * Lista 2 - Exercício 15
 * Lê peso e altura, calcula IMC = peso / (altura * altura) e classifica: < 18,5 Abaixo do
 * peso; 18,5 a 24,9 Normal; 25 a 29,9 Sobrepeso; >= 30 Obesidade.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = sc.nextDouble();
        System.out.print("Digite a altura em metros: ");
        double altura = sc.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso e altura devem ser maiores que zero");
        } else {
            double imc = peso / (altura * altura);
            System.out.printf("IMC: %.2f%n", imc);

            if (imc < 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc < 25) {
                System.out.println("Normal");
            } else if (imc < 30) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidade");
            }
        }

        sc.close();
    }
}
