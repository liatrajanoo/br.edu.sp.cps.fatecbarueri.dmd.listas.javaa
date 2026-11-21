package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista04.exercicio21.jogodavelha;

/*
 * Lista 4 - Exercício 21
 * Jogo da velha para dois jogadores (X e O) usando uma matriz 3x3 de char. Os jogadores
 * alternam as jogadas informando linha e coluna (1 a 3); o programa valida posição
 * inválida ou ocupada, detecta vitória (linha, coluna ou diagonal) e empate (velha) e
 * exibe o tabuleiro a cada jogada.
 */
import java.util.Scanner;

public class Main {
    private static final char VAZIO = ' ';

    private static void exibirTabuleiro(char[][] t) {
        System.out.println();
        System.out.println("     1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.println("   +---+---+---+");
            System.out.print(" " + (i + 1) + " |");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + t[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println("   +---+---+---+");
        System.out.println();
    }

    private static boolean venceu(char[][] t, char jogador) {
        for (int i = 0; i < 3; i++) {
            if (t[i][0] == jogador && t[i][1] == jogador && t[i][2] == jogador) {
                return true; // linha
            }
            if (t[0][i] == jogador && t[1][i] == jogador && t[2][i] == jogador) {
                return true; // coluna
            }
        }
        if (t[0][0] == jogador && t[1][1] == jogador && t[2][2] == jogador) {
            return true; // diagonal principal
        }
        return t[0][2] == jogador && t[1][1] == jogador && t[2][0] == jogador; // diagonal secundária
    }

    private static boolean tabuleiroCheio(char[][] t) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j] == VAZIO) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = VAZIO;
            }
        }

        char jogadorAtual = 'X';
        boolean fimDeJogo = false;

        System.out.println("===== JOGO DA VELHA =====");
        exibirTabuleiro(tabuleiro);

        while (!fimDeJogo) {
            System.out.println("Vez do jogador " + jogadorAtual);
            System.out.print("Linha (1 a 3): ");
            int linha = sc.nextInt() - 1;
            System.out.print("Coluna (1 a 3): ");
            int coluna = sc.nextInt() - 1;

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posição inválida! Use valores de 1 a 3.");
            } else if (tabuleiro[linha][coluna] != VAZIO) {
                System.out.println("Posição já ocupada! Escolha outra.");
            } else {
                tabuleiro[linha][coluna] = jogadorAtual;
                exibirTabuleiro(tabuleiro);

                if (venceu(tabuleiro, jogadorAtual)) {
                    System.out.println("O jogador " + jogadorAtual + " venceu! Parabéns!");
                    fimDeJogo = true;
                } else if (tabuleiroCheio(tabuleiro)) {
                    System.out.println("Deu velha! O jogo terminou empatado.");
                    fimDeJogo = true;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            }
        }

        sc.close();
    }
}
