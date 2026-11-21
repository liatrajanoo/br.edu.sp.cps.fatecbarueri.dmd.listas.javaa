package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio10.conjunto;

/*
 * Lista 1 - Exercício 10
 * Classe Conjunto de Strings (array que cresce por demanda) com: adicionar (sem
 * repetir), pertence, uniao, inter (interseção) e menos (subtração).
 */
public class Main {
    public static void main(String[] args) {
        Conjunto a = new Conjunto();
        String[] frutasA = {"maçã", "banana", "uva", "pera", "manga", "kiwi"};
        for (String f : frutasA) {
            a.adicionar(f);
        }
        System.out.println("Adicionar 'uva' de novo? " + a.adicionar("uva"));

        Conjunto b = new Conjunto();
        b.adicionar("uva");
        b.adicionar("laranja");
        b.adicionar("pera");
        b.adicionar("limão");

        System.out.println("A = " + a + " (tamanho " + a.tamanho() + ")");
        System.out.println("B = " + b + " (tamanho " + b.tamanho() + ")");
        System.out.println("'banana' pertence a A? " + a.pertence("banana"));
        System.out.println("'banana' pertence a B? " + b.pertence("banana"));

        System.out.println("A união B = " + a.uniao(b));
        System.out.println("A interseção B = " + a.inter(b));
        System.out.println("A menos B = " + a.menos(b));
        System.out.println("B menos A = " + b.menos(a));
        System.out.println("A continua = " + a);
    }
}
