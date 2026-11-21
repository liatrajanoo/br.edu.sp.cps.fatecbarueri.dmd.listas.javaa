package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio22.sudokusimplificado;

/*
 * Lista 4 - Exercício 22
 * Verifica se uma matriz 3x3 não possui números repetidos.
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

        boolean repetido = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // compara o elemento atual com todos os elementos seguintes
                for (int k = i; k < 3; k++) {
                    int inicio = (k == i) ? j + 1 : 0;
                    for (int l = inicio; l < 3; l++) {
                        if (m[i][j] == m[k][l]) {
                            repetido = true;
                        }
                    }
                }
            }
        }

        if (repetido) {
            System.out.println("A matriz possui números repetidos");
        } else {
            System.out.println("A matriz não possui números repetidos");
        }

        sc.close();
    }
}
