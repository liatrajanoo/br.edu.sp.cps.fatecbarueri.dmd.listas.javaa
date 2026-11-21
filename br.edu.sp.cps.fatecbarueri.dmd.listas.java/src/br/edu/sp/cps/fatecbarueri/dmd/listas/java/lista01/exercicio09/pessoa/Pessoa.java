package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio09.pessoa;

import java.util.Objects;

/**
 * Representa uma pessoa em uma árvore genealógica (nome, pai e mãe).
 */
public class Pessoa {

    private final String nome;
    private final Pessoa pai;
    private final Pessoa mae;

    /** Cria uma pessoa com nome e seus antecessores diretos (podem ser null). */
    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        this.nome = nome.trim();
        this.pai = pai;
        this.mae = mae;
    }

    /** Cria uma pessoa sem antecessores conhecidos (pai e mãe null). */
    public Pessoa(String nome) {
        this(nome, null, null);
    }

    public String getNome() {
        return nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    /** Duas pessoas são iguais se possuem o mesmo nome e a mesma mãe. */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pessoa outra = (Pessoa) obj;
        return nome.equals(outra.nome) && Objects.equals(mae, outra.mae);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, mae);
    }

    /**
     * Verifica se duas pessoas são irmãs: são pessoas diferentes que têm o mesmo pai
     * ou a mesma mãe (conhecidos). Meios-irmãos também são considerados irmãos.
     */
    public boolean ehIrma(Pessoa outra) {
        if (outra == null || this == outra || this.equals(outra)) {
            return false;
        }
        boolean mesmaMae = mae != null && mae.equals(outra.mae);
        boolean mesmoPai = pai != null && pai.equals(outra.pai);
        return mesmaMae || mesmoPai;
    }

    /**
     * Verifica se "possivel" é antecessora desta pessoa: é seu pai ou sua mãe, ou
     * antecessora do pai ou antecessora da mãe.
     */
    public boolean ehAntecessora(Pessoa possivel) {
        if (possivel == null) {
            return false;
        }
        if (pai != null && (pai.equals(possivel) || pai.ehAntecessora(possivel))) {
            return true;
        }
        return mae != null && (mae.equals(possivel) || mae.ehAntecessora(possivel));
    }

    @Override
    public String toString() {
        return nome;
    }
}
