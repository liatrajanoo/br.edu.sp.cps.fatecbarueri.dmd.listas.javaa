package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio01.separandoimpressao;

/*
 * Lista 5 - Exercício 1
 * Divide a impressão do main em dois métodos: mostrarTitulo() e mostrarMenu().
 */
public class Main {

    public static void mostrarTitulo() {
        System.out.println("===============");
        System.out.println("   SISTEMA");
        System.out.println("===============");
    }

    public static void mostrarMenu() {
        System.out.println("1 - Entrar");
        System.out.println("2 - Sair");
    }

    public static void main(String[] args) {
        mostrarTitulo();
        mostrarMenu();
    }
}
