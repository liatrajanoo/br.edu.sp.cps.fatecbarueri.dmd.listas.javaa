package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio04.reta;

/*
 * Lista 1 - Exercício 4
 * Classe Reta (y = ax + b) com construtores (coeficientes ou dois pontos), acesso aos
 * coeficientes, pertinência de ponto, toString e interseção com outra reta.
 * (O "5)" solto no enunciado é o 2º construtor: a reta a partir de dois pontos.)
 */
public class Main {
    public static void main(String[] args) {
        Reta r1 = new Reta(2, 1);
        Reta r2 = new Reta(new Ponto2D(0, 5), new Ponto2D(2, 3));

        System.out.println("r1 = " + r1);
        System.out.println("r2 (por dois pontos) = " + r2);
        System.out.println("r1: a = " + r1.getCoeficienteAngular() + ", b = " + r1.getCoeficienteLinear());
        System.out.println("r2: a = " + r2.getCoeficienteAngular() + ", b = " + r2.getCoeficienteLinear());

        Ponto2D pertence = new Ponto2D(3, 7);
        Ponto2D naoPertence = new Ponto2D(3, 8);
        System.out.println(pertence + " pertence a r1? " + r1.contem(pertence));
        System.out.println(naoPertence + " pertence a r1? " + r1.contem(naoPertence));

        Ponto2D inter = r1.intersecao(r2);
        System.out.println("interseção de r1 e r2 = " + inter);

        Reta paralela = new Reta(2, 10);
        System.out.println("r1 = " + r1 + " | paralela = " + paralela);
        System.out.println("interseção de r1 com a paralela = " + r1.intersecao(paralela));

        try {
            new Reta(new Ponto2D(1, 1), new Ponto2D(1, 5));
        } catch (IllegalArgumentException e) {
            System.out.println("Reta vertical rejeitada: " + e.getMessage());
        }
    }
}
