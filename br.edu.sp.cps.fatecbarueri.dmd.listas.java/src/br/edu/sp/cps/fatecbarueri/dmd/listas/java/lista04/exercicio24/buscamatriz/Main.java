package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio24.buscamatriz;

/*
 * Lista 4 - Exercício 24
 * Lê uma matriz 5x5 e um número e informa a posição (linha e coluna) onde ele aparece.
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

        int[][] m = lerMatriz(sc, 5, 5, "M");

        System.out.print("Digite o número a procurar: ");
        int x = sc.nextInt();

        int ocorrencias = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == x) {
                    System.out.println("Número " + x + " encontrado na linha " + (i + 1)
                            + ", coluna " + (j + 1));
                    ocorrencias++;
                }
            }
        }

        if (ocorrencias == 0) {
            System.out.println("Número " + x + " não encontrado na matriz");
        }

        sc.close();
    }
}
