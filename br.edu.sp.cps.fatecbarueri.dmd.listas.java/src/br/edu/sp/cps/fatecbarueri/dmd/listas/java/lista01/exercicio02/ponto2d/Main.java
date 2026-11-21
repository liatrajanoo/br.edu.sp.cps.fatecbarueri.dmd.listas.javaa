package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio02.ponto2d;

/*
 * Lista 1 - Exercício 2
 * Classe Ponto2D (ponto no plano cartesiano) com construtores sobrecarregados,
 * getters/setters, mover (sobrecarregado), equals, toString, distancia e clone.
 */
public class Main {
    public static void main(String[] args) {
        Ponto2D origem = new Ponto2D();
        Ponto2D p = new Ponto2D(3, 4);
        Ponto2D copiaConstrutor = new Ponto2D(p);

        System.out.println("origem = " + origem);
        System.out.println("p = " + p);
        System.out.println("copia via construtor = " + copiaConstrutor);

        System.out.println("getX = " + p.getX() + ", getY = " + p.getY());
        p.setX(6);
        p.setY(8);
        System.out.println("após setX(6) e setY(8): p = " + p);

        System.out.println("distância de p até a origem = " + p.distancia(origem));

        Ponto2D q = p.clone();
        System.out.println("clone de p = " + q + " (mesmo objeto? " + (p == q) + ")");
        System.out.println("p.equals(q) = " + p.equals(q));
        System.out.println("p.equals(origem) = " + p.equals(origem));

        q.mover(1, 1);
        System.out.println("q.mover(1, 1): q = " + q + " | p continua " + p);
        q.mover(p);
        System.out.println("q.mover(p): q = " + q);
        q.mover();
        System.out.println("q.mover(): q = " + q);
        System.out.println("distância entre (0,0) e (1,1) = " + new Ponto2D().distancia(new Ponto2D(1, 1)));
    }
}
