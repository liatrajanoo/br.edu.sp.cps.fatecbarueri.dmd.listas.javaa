package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio07.contador;

/*
 * Lista 5 - Exercício 7
 * Mostra os números de 1 até 100 com mostrarNumeros(), mostrarPares() e mostrarImpares().
 */
public class Main {

    private static final int INICIO = 1;
    private static final int FIM = 100;

    public static void mostrarNumeros() {
        for (int i = INICIO; i <= FIM; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mostrarPares() {
        mostrarComResto(0);
    }

    public static void mostrarImpares() {
        mostrarComResto(1);
    }

    private static void mostrarComResto(int resto) {
        for (int i = INICIO; i <= FIM; i++) {
            if (i % 2 == resto) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Todos os números de 1 a 100:");
        mostrarNumeros();

        System.out.println("\nPares:");
        mostrarPares();

        System.out.println("\nÍmpares:");
        mostrarImpares();
    }
}
