package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio07.pais;

/*
 * Lista 1 - Exercício 7
 * Classe Pais (código ISO 3166-1, nome, população, dimensão em km2) com lista de
 * países limítrofes (máximo 40): igualdade pelo código ISO, verificação de fronteira,
 * densidade populacional e vizinhos comuns.
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
        Pais chile = new Pais("CHL", "Chile", 756102);
        chile.setPopulacao(19500000L);

        brasil.adicionarVizinho(argentina);
        brasil.adicionarVizinho(uruguai);
        brasil.adicionarVizinho(paraguai);
        argentina.adicionarVizinho(uruguai);
        argentina.adicionarVizinho(paraguai);
        argentina.adicionarVizinho(chile);

        System.out.println(brasil + " - população " + brasil.getPopulacao()
                + ", dimensão " + brasil.getDimensao() + " km2");
        System.out.println("Densidade do Brasil: " + brasil.densidadePopulacional() + " hab/km2");

        System.out.println("Brasil é limítrofe da Argentina? " + brasil.ehLimitrofe(argentina));
        System.out.println("Brasil é limítrofe do Chile? " + brasil.ehLimitrofe(chile));

        Pais outroBrasil = new Pais("BRA", "Brazil", 1);
        System.out.println("Brasil equals outro objeto com código BRA? " + brasil.equals(outroBrasil));
        System.out.println("Brasil equals Argentina? " + brasil.equals(argentina));

        Pais[] comuns = brasil.vizinhosComuns(argentina);
        System.out.println("Vizinhos comuns de Brasil e Argentina (" + comuns.length + "):");
        for (Pais p : comuns) {
            System.out.println(" - " + p);
        }

        brasil.setNome("Brasil");
        System.out.println("Código ISO: " + brasil.getCodigoIso() + " | nome: " + brasil.getNome());
    }
}
