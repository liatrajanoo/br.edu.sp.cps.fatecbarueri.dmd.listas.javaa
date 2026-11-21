package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio12.pedrapapeltesoura;

/*
 * Lista 5 - Exercício 12
 * Jogo dividido em mostrarMenu(), jogadaComputador(), jogadaJogador(), verificarVencedor() e
 * mostrarResultado(). Jogada inválida do jogador não dá vitória ao computador: o programa
 * avisa e pede a jogada de novo. O jogo repete até o jogador escolher sair.
 */
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final int SAIR = 0;
    private static final int PEDRA = 1;
    private static final int PAPEL = 2;
    private static final int TESOURA = 3;

    private static final int EMPATE = 0;
    private static final int JOGADOR = 1;
    private static final int COMPUTADOR = 2;

    private static final Random random = new Random();

    public static void mostrarMenu() {
        System.out.println("\n===== PEDRA, PAPEL OU TESOURA =====");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("0 - Sair");
    }

    public static int jogadaJogador() {
        System.out.print("Sua jogada: ");
        return scanner.nextInt();
    }

    public static boolean ehJogadaValida(int jogada) {
        return jogada >= PEDRA && jogada <= TESOURA;
    }

    public static int jogadaComputador() {
        return random.nextInt(3) + 1;
    }

    public static int verificarVencedor(int jogador, int computador) {
        if (jogador == computador) {
            return EMPATE;
        }
        boolean jogadorVence = (jogador == PEDRA && computador == TESOURA)
                || (jogador == PAPEL && computador == PEDRA)
                || (jogador == TESOURA && computador == PAPEL);
        return jogadorVence ? JOGADOR : COMPUTADOR;
    }

    public static String nomeDaJogada(int jogada) {
        switch (jogada) {
            case PEDRA:
                return "Pedra";
            case PAPEL:
                return "Papel";
            default:
                return "Tesoura";
        }
    }

    public static void mostrarResultado(int jogador, int computador, int vencedor) {
        System.out.println("Você: " + nomeDaJogada(jogador) + " | Computador: " + nomeDaJogada(computador));
        if (vencedor == EMPATE) {
            System.out.println("Empate!");
        } else if (vencedor == JOGADOR) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("O computador venceu!");
        }
    }

    public static void main(String[] args) {
        int jogador;
        do {
            mostrarMenu();
            jogador = jogadaJogador();

            if (jogador == SAIR) {
                System.out.println("Até a próxima!");
            } else if (!ehJogadaValida(jogador)) {
                System.out.println("Jogada inválida! Escolha 1, 2, 3 ou 0 para sair.");
            } else {
                int computador = jogadaComputador();
                int vencedor = verificarVencedor(jogador, computador);
                mostrarResultado(jogador, computador, vencedor);
            }
        } while (jogador != SAIR);

        scanner.close();
    }
}
