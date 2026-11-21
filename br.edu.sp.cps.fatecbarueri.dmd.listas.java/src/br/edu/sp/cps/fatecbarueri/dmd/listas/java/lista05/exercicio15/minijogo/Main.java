package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio15.minijogo;

/*
 * Lista 5 - Exercício 15
 * Mini jogo de batalha (jogador x monstro) dividido em funções: iniciarJogo(), mostrarMenu(),
 * criarJogador(), executarTurno(), verificarVitoria() e encerrarJogo().
 */
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final Random random = new Random();

    static class Lutador {
        String nome;
        int vida;
        int vidaMaxima;
        int ataqueMinimo;
        int ataqueMaximo;
        int pocoes;
    }

    public static void iniciarJogo() {
        System.out.println("=================================");
        System.out.println("   BATALHA NA MASMORRA");
        System.out.println("=================================");
        System.out.println("Derrote o monstro antes que ele derrote você!");
    }

    public static Lutador criarLutador(String nome, int vida, int ataqueMin, int ataqueMax, int pocoes) {
        Lutador l = new Lutador();
        l.nome = nome;
        l.vida = vida;
        l.vidaMaxima = vida;
        l.ataqueMinimo = ataqueMin;
        l.ataqueMaximo = ataqueMax;
        l.pocoes = pocoes;
        return l;
    }

    public static Lutador criarJogador() {
        System.out.print("\nDigite o nome do seu herói: ");
        String nome = scanner.nextLine().trim();
        if (nome.isEmpty()) {
            nome = "Herói";
        }
        return criarLutador(nome, 100, 10, 20, 3);
    }

    public static Lutador criarMonstro() {
        return criarLutador("Dragão", 100, 6, 16, 0);
    }

    public static boolean estaVivo(Lutador l) {
        return l.vida > 0;
    }

    public static void mostrarStatus(Lutador jogador, Lutador monstro) {
        System.out.println("\n" + jogador.nome + ": " + jogador.vida + "/" + jogador.vidaMaxima
                + " de vida (poções: " + jogador.pocoes + ")");
        System.out.println(monstro.nome + ": " + monstro.vida + "/" + monstro.vidaMaxima + " de vida");
    }

    public static void mostrarMenu() {
        System.out.println("1 - Atacar");
        System.out.println("2 - Usar poção (+30 de vida)");
        System.out.println("3 - Fugir");
    }

    public static int lerOpcao() {
        System.out.print("Escolha uma ação: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    public static int calcularDano(Lutador l) {
        return random.nextInt(l.ataqueMaximo - l.ataqueMinimo + 1) + l.ataqueMinimo;
    }

    public static void atacar(Lutador atacante, Lutador alvo) {
        int dano = calcularDano(atacante);
        alvo.vida = Math.max(0, alvo.vida - dano);
        System.out.println(atacante.nome + " causou " + dano + " de dano em " + alvo.nome + ".");
    }

    public static void usarPocao(Lutador l) {
        if (l.pocoes <= 0) {
            System.out.println("Você não tem mais poções!");
            return;
        }
        l.pocoes--;
        l.vida = Math.min(l.vidaMaxima, l.vida + 30);
        System.out.println(l.nome + " usou uma poção e agora tem " + l.vida + " de vida.");
    }

    /** Executa um turno completo. Devolve true se o jogador fugiu. */
    public static boolean executarTurno(Lutador jogador, Lutador monstro) {
        int opcao = lerOpcao();

        if (opcao == 3) {
            return true;
        }
        if (opcao == 1) {
            atacar(jogador, monstro);
        } else if (opcao == 2) {
            usarPocao(jogador);
        } else {
            System.out.println("Opção inválida! Você perdeu a vez.");
        }

        if (estaVivo(monstro)) {
            atacar(monstro, jogador);
        }
        return false;
    }

    public static boolean verificarVitoria(Lutador monstro) {
        return !estaVivo(monstro);
    }

    public static void encerrarJogo(boolean venceu, boolean fugiu) {
        System.out.println();
        if (fugiu) {
            System.out.println("Você fugiu da batalha. Fim de jogo.");
        } else if (venceu) {
            System.out.println("VITÓRIA! O monstro foi derrotado!");
        } else {
            System.out.println("DERROTA! Você foi derrotado pelo monstro.");
        }
    }

    public static void main(String[] args) {
        iniciarJogo();

        Lutador jogador = criarJogador();
        Lutador monstro = criarMonstro();
        boolean fugiu = false;

        while (estaVivo(jogador) && estaVivo(monstro) && !fugiu) {
            mostrarStatus(jogador, monstro);
            mostrarMenu();
            fugiu = executarTurno(jogador, monstro);
        }

        boolean venceu = verificarVitoria(monstro);
        encerrarJogo(venceu, fugiu);
        scanner.close();
    }
}
