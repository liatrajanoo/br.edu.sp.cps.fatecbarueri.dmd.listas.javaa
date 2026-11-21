package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio06.circulo;

/*
 * Lista 1 - Exercício 6
 * Classe Circulo com construtores (raio + centro; só o raio), acesso ao raio,
 * inflar/desinflar (por valor e por unidade), mover (sobrecarregado) e área.
 * (Não existe exercício 5: a numeração impressa na lista foi mantida.)
 */
public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2, new Ponto2D(3, 4));
        Circulo c2 = new Circulo(5);

        System.out.println("c1 = " + c1);
        System.out.println("c2 (na origem) = " + c2);
        System.out.println("raio de c1 = " + c1.getRaio());
        System.out.println("área de c1 = " + c1.area());

        c1.setRaio(3);
        System.out.println("após setRaio(3): " + c1);
        c1.inflar(2.5);
        System.out.println("após inflar(2.5): " + c1);
        c1.desinflar(1.5);
        System.out.println("após desinflar(1.5): " + c1);
        c1.inflar();
        System.out.println("após inflar(): " + c1);
        c1.desinflar();
        System.out.println("após desinflar(): " + c1);

        c1.mover(10, -2);
        System.out.println("após mover(10, -2): " + c1);
        c1.mover(new Ponto2D(7, 7));
        System.out.println("após mover(Ponto2D(7, 7)): " + c1);
        c1.mover();
        System.out.println("após mover() (origem): " + c1);

        System.out.println("área de c2 = " + c2.area());

        try {
            c2.desinflar(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Raio negativo rejeitado: " + e.getMessage());
        }
    }
}
