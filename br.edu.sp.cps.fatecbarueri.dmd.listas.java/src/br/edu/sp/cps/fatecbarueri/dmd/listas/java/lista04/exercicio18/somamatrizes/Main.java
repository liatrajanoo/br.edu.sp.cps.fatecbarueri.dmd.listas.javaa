package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio18.somamatrizes;

/*
 * Lista 4 - Exercício 18
 * Lê duas matrizes 3x3 e gera uma terceira com a soma.
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

    private static void exibirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%5d", m[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = lerMatriz(sc, 3, 3, "A");
        int[][] b = lerMatriz(sc, 3, 3, "B");

        int[][] soma = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matriz soma (A + B):");
        exibirMatriz(soma);

        sc.close();
    }
}
