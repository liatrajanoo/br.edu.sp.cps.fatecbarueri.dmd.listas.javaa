package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio11.jogoadivinhacao;

/*
 * Lista 5 - Exercício 11
 * Jogo em que o jogador tenta acertar um número de 1 a 100, dividido em sortearNumero(),
 * lerPalpite(), verificarAcerto(), mostrarDica() e mostrarVitoria(). O main só controla o fluxo.
 */
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final int MINIMO = 1;
    private static final int MAXIMO = 100;

    public static int sortearNumero() {
        return new Random().nextInt(MAXIMO - MINIMO + 1) + MINIMO;
    }

    public static int lerPalpite() {
        int palpite;
        do {
            System.out.print("Digite seu palpite (" + MINIMO + " a " + MAXIMO + "): ");
            palpite = scanner.nextInt();
            if (palpite < MINIMO || palpite > MAXIMO) {
                System.out.println("Palpite fora do intervalo.");
            }
        } while (palpite < MINIMO || palpite > MAXIMO);
        return palpite;
    }

    public static boolean verificarAcerto(int palpite, int numeroSecreto) {
        return palpite == numeroSecreto;
    }

    public static void mostrarDica(int palpite, int numeroSecreto) {
        if (palpite < numeroSecreto) {
            System.out.println("Dica: o número secreto é MAIOR.");
        } else {
            System.out.println("Dica: o número secreto é MENOR.");
        }
    }

    public static void mostrarVitoria(int tentativas) {
        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s)!");
    }

    public static void main(String[] args) {
        int numeroSecreto = sortearNumero();
        int tentativas = 0;
        boolean acertou = false;

        while (!acertou) {
            int palpite = lerPalpite();
            tentativas++;
            acertou = verificarAcerto(palpite, numeroSecreto);

            if (!acertou) {
                mostrarDica(palpite, numeroSecreto);
            }
        }

        mostrarVitoria(tentativas);
        scanner.close();
    }
}
