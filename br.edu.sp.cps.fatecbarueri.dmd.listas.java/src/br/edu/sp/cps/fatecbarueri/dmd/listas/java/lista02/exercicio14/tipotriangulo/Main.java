package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista02.exercicio14.tipotriangulo;

/*
 * Lista 2 - Exercício 14
 * Lê três lados e classifica em Equilátero, Isósceles ou Escaleno, validando antes se os
 * lados formam um triângulo (lados positivos e cada lado menor que a soma dos outros dois).
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo lado: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int c = sc.nextInt();

        boolean ladosPositivos = a > 0 && b > 0 && c > 0;
        boolean formaTriangulo = ladosPositivos && a < b + c && b < a + c && c < a + b;

        if (!formaTriangulo) {
            System.out.println("Os lados informados não formam um triângulo");
        } else if (a == b && b == c) {
            System.out.println("Triângulo Equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }

        sc.close();
    }
}
