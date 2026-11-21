package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio14.maiorvalormatriz;

/*
 * Lista 4 - Exercício 14
 * Lê uma matriz 4x4 e encontra o maior valor.
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

        int[][] m = lerMatriz(sc, 4, 4, "M");

        int maior = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }

        System.out.println("Maior valor da matriz: " + maior);

        sc.close();
    }
}
