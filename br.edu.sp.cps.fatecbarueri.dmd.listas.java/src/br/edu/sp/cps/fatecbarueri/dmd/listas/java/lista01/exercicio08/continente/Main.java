package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio08.continente;

/*
 * Lista 1 - Exercício 8
 * Classe Continente (nome + conjunto de países, no máximo 48) com: adicionar país,
 * dimensão total, população total, densidade, país de maior/menor população,
 * país de maior/menor dimensão e razão territorial entre o maior e o menor país.
 */
public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 8515767.049);
        brasil.setPopulacao(193946886L);
        Pais argentina = new Pais("ARG", "Argentina", 2780400);
        argentina.setPopulacao(46000000L);
        Pais uruguai = new Pais("URY", "Uruguai", 176215);
        uruguai.setPopulacao(3400000L);
        Pais paraguai = new Pais("PRY", "Paraguai", 406752);
        paraguai.setPopulacao(7200000L);

        Continente america = new Continente("América do Sul");
        System.out.println(america.adicionarPais(brasil));
        System.out.println(america.adicionarPais(argentina));
        System.out.println(america.adicionarPais(uruguai));
        System.out.println(america.adicionarPais(paraguai));
        System.out.println("Adicionar Brasil de novo? " + america.adicionarPais(brasil));

        System.out.println(america);
        System.out.printf("Dimensão total: %.3f km2%n", america.dimensaoTotal());
        System.out.println("População total: " + america.populacaoTotal());
        System.out.printf("Densidade: %.2f hab/km2%n", america.densidadePopulacional());
        System.out.println("Maior população: " + america.paisMaiorPopulacao());
        System.out.println("Menor população: " + america.paisMenorPopulacao());
        System.out.println("Maior dimensão: " + america.paisMaiorDimensao());
        System.out.println("Menor dimensão: " + america.paisMenorDimensao());
        System.out.printf("Razão territorial (maior/menor): %.2f%n", america.razaoTerritorial());

        Continente vazio = new Continente("Antártida");
        System.out.println(vazio + " - maior população: " + vazio.paisMaiorPopulacao());
        try {
            vazio.razaoTerritorial();
        } catch (IllegalStateException e) {
            System.out.println("Continente vazio: " + e.getMessage());
        }
    }
}
