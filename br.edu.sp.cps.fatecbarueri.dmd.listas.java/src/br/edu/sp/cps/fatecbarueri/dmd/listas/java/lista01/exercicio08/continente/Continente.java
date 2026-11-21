package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio08.continente;

/**
 * Representa um continente, composto por um conjunto de países (no máximo 48).
 */
public class Continente {

    public static final int MAX_PAISES = 48;

    private String nome;
    private final Pais[] paises = new Pais[MAX_PAISES];
    private int qtdPaises = 0;

    public Continente(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do continente não pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public String getNome() {
        return nome;
    }

    public int getQtdPaises() {
        return qtdPaises;
    }

    /**
     * Adiciona um país ao continente. Devolve false se o país for nulo, já existir
     * (mesmo código ISO) ou se o continente já tiver 48 países.
     */
    public boolean adicionarPais(Pais pais) {
        if (pais == null || qtdPaises >= MAX_PAISES) {
            return false;
        }
        for (int i = 0; i < qtdPaises; i++) {
            if (paises[i].equals(pais)) {
                return false;
            }
        }
        paises[qtdPaises++] = pais;
        return true;
    }

    /** Dimensão total do continente (km2). */
    public double dimensaoTotal() {
        double total = 0;
        for (int i = 0; i < qtdPaises; i++) {
            total += paises[i].getDimensao();
        }
        return total;
    }

    /** População total do continente. */
    public long populacaoTotal() {
        long total = 0;
        for (int i = 0; i < qtdPaises; i++) {
            total += paises[i].getPopulacao();
        }
        return total;
    }

    /** Densidade populacional do continente (hab/km2); 0 se não houver países. */
    public double densidadePopulacional() {
        if (qtdPaises == 0) {
            return 0;
        }
        return populacaoTotal() / dimensaoTotal();
    }

    /** País de maior população (null se o continente estiver vazio). */
    public Pais paisMaiorPopulacao() {
        Pais escolhido = null;
        for (int i = 0; i < qtdPaises; i++) {
            if (escolhido == null || paises[i].getPopulacao() > escolhido.getPopulacao()) {
                escolhido = paises[i];
            }
        }
        return escolhido;
    }

    /** País de menor população (null se o continente estiver vazio). */
    public Pais paisMenorPopulacao() {
        Pais escolhido = null;
        for (int i = 0; i < qtdPaises; i++) {
            if (escolhido == null || paises[i].getPopulacao() < escolhido.getPopulacao()) {
                escolhido = paises[i];
            }
        }
        return escolhido;
    }

    /** País de maior dimensão territorial (null se o continente estiver vazio). */
    public Pais paisMaiorDimensao() {
        Pais escolhido = null;
        for (int i = 0; i < qtdPaises; i++) {
            if (escolhido == null || paises[i].getDimensao() > escolhido.getDimensao()) {
                escolhido = paises[i];
            }
        }
        return escolhido;
    }

    /** País de menor dimensão territorial (null se o continente estiver vazio). */
    public Pais paisMenorDimensao() {
        Pais escolhido = null;
        for (int i = 0; i < qtdPaises; i++) {
            if (escolhido == null || paises[i].getDimensao() < escolhido.getDimensao()) {
                escolhido = paises[i];
            }
        }
        return escolhido;
    }

    /**
     * Razão territorial: dimensão do maior país dividida pela dimensão do menor.
     * Lança IllegalStateException se o continente estiver vazio.
     */
    public double razaoTerritorial() {
        if (qtdPaises == 0) {
            throw new IllegalStateException("O continente não possui países.");
        }
        return paisMaiorDimensao().getDimensao() / paisMenorDimensao().getDimensao();
    }

    @Override
    public String toString() {
        return "Continente " + nome + " (" + qtdPaises + " países)";
    }
}
