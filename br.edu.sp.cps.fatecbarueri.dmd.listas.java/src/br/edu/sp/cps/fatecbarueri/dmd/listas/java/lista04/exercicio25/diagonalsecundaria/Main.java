package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio25.diagonalsecundaria;

/*
 * Lista 4 - Exercício 25
 * Lê uma matriz 3x3 e calcula a soma da diagonal secundária.
 */
import java.util.Scanner;

public class Main {
    private static int[][] lerMatriz(Scanner sc, int linhas, int colunas, String nome) {
        int[][] m = new int[linhas][colunas];
        System.out.println("Digite os elementos da matriz " + nome + " (" + linhas + "x" + colunas + "):");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(nome + "[" + (i + 1) + "][" + (j + 1) + "] = ");
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = lerMatriz(sc, 3, 3, "M");

        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            soma += m[i][m.length - 1 - i];
        }

        System.out.println("Soma da diagonal secundária: " + soma);

        sc.close();
    }
}
