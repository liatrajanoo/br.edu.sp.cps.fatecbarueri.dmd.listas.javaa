package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio19.identidade;

/*
 * Lista 4 - Exercício 19
 * Verifica se uma matriz 3x3 é identidade (diagonal principal 1 e os demais elementos 0).
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

        boolean identidade = true;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                int esperado = (i == j) ? 1 : 0;
                if (m[i][j] != esperado) {
                    identidade = false;
                }
            }
        }

        if (identidade) {
            System.out.println("A matriz é identidade");
        } else {
            System.out.println("A matriz não é identidade");
        }

        sc.close();
    }
}
