package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio20.somalinhacoluna;

/*
 * Lista 4 - Exercício 20
 * Lê uma matriz 3x3 e informa a soma de cada linha e a soma de cada coluna.
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

        System.out.println("Soma de cada linha:");
        for (int i = 0; i < m.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < m[i].length; j++) {
                somaLinha += m[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
        }

        System.out.println("Soma de cada coluna:");
        for (int j = 0; j < m[0].length; j++) {
            int somaColuna = 0;
            for (int i = 0; i < m.length; i++) {
                somaColuna += m[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
        }

        sc.close();
    }
}
