package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista05.exercicio02.separandocalculo;

/*
 * Lista 5 - Exercício 2
 * Separa o cálculo da exibição: somar() e mostrarResultado().
 */
public class Main {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static void mostrarResultado(int resultado) {
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int soma = somar(n1, n2);
        mostrarResultado(soma);
    }
}
