package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio13.rpgsimples;

/*
 * Lista 5 - Exercício 13
 * Personagem com vida: criarPersonagem(), mostrarStatus(), atacar(), receberDano() e curar().
 * O main executa uma pequena batalha com dados fixos.
 */
public class Main {

    static class Personagem {
        String nome;
        int vida;
        int vidaMaxima;
        int ataque;
    }

    public static Personagem criarPersonagem(String nome, int vida, int ataque) {
        Personagem p = new Personagem();
        p.nome = nome;
        p.vida = vida;
        p.vidaMaxima = vida;
        p.ataque = ataque;
        return p;
    }

    public static void mostrarStatus(Personagem p) {
        System.out.println(p.nome + " - Vida: " + p.vida + "/" + p.vidaMaxima + " | Ataque: " + p.ataque);
    }

    public static boolean estaVivo(Personagem p) {
        return p.vida > 0;
    }

    public static void receberDano(Personagem p, int dano) {
        p.vida = Math.max(0, p.vida - dano);
        System.out.println(p.nome + " recebeu " + dano + " de dano (vida: " + p.vida + ")");
        if (!estaVivo(p)) {
            System.out.println(p.nome + " foi derrotado!");
        }
    }

    public static void atacar(Personagem atacante, Personagem alvo) {
        if (!estaVivo(atacante)) {
            System.out.println(atacante.nome + " está derrotado e não pode atacar.");
        } else if (!estaVivo(alvo)) {
            System.out.println(alvo.nome + " já está derrotado.");
        } else {
            System.out.println(atacante.nome + " ataca " + alvo.nome + "!");
            receberDano(alvo, atacante.ataque);
        }
    }

    public static void curar(Personagem p, int quantidade) {
        if (!estaVivo(p)) {
            System.out.println(p.nome + " está derrotado e não pode ser curado.");
            return;
        }
        p.vida = Math.min(p.vidaMaxima, p.vida + quantidade);
        System.out.println(p.nome + " se curou em até " + quantidade + " (vida: " + p.vida + ")");
    }

    public static void main(String[] args) {
        Personagem heroi = criarPersonagem("Herói", 100, 18);
        Personagem goblin = criarPersonagem("Goblin", 60, 12);

        mostrarStatus(heroi);
        mostrarStatus(goblin);

        System.out.println("\n--- Turno 1 ---");
        atacar(heroi, goblin);
        atacar(goblin, heroi);

        System.out.println("\n--- Turno 2 ---");
        curar(heroi, 15);
        atacar(goblin, heroi);

        System.out.println("\n--- Turno 3 ---");
        atacar(heroi, goblin);
        atacar(heroi, goblin);

        System.out.println("\n--- Turno 4 ---");
        atacar(heroi, goblin);
        atacar(goblin, heroi);

        System.out.println();
        mostrarStatus(heroi);
        mostrarStatus(goblin);
    }
}
