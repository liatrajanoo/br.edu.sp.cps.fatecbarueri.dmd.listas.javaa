package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio09.pessoa;

/*
 * Lista 1 - Exercício 9
 * Classe Pessoa (árvore genealógica): nome, pai e mãe, com construtores sobrecarregados,
 * igualdade semântica (mesmo nome e mesma mãe), verificação de irmãos e de antecessores.
 */
public class Main {
    public static void main(String[] args) {
        Pessoa avoMaterno = new Pessoa("Antônio");
        Pessoa avoMaterna = new Pessoa("Rita");
        Pessoa avoPaterno = new Pessoa("José");
        Pessoa avoPaterna = new Pessoa("Lúcia");

        Pessoa mae = new Pessoa("Maria", avoMaterno, avoMaterna);
        Pessoa pai = new Pessoa("Carlos", avoPaterno, avoPaterna);

        Pessoa ana = new Pessoa("Ana", pai, mae);
        Pessoa bruno = new Pessoa("Bruno", pai, mae);
        Pessoa primo = new Pessoa("Paulo", new Pessoa("Roberto"), new Pessoa("Helena"));

        System.out.println("Ana: pai = " + ana.getPai() + ", mãe = " + ana.getMae());
        System.out.println("Pessoa sem antecessores: pai = " + avoPaterno.getPai() + ", mãe = " + avoPaterno.getMae());

        System.out.println("Ana e Bruno são irmãos? " + ana.ehIrma(bruno));
        System.out.println("Ana e Paulo são irmãos? " + ana.ehIrma(primo));
        System.out.println("Ana é irmã dela mesma? " + ana.ehIrma(ana));

        Pessoa anaHomonima = new Pessoa("Ana", new Pessoa("Outro Pai"), mae);
        System.out.println("Ana equals outra Ana com a mesma mãe? " + ana.equals(anaHomonima));
        System.out.println("Ana equals Bruno? " + ana.equals(bruno));
        System.out.println("Ana equals Ana com outra mãe? "
                + ana.equals(new Pessoa("Ana", pai, new Pessoa("Maria", null, null))));

        System.out.println("Carlos é antecessor de Ana? " + ana.ehAntecessora(pai));
        System.out.println("Maria é antecessora de Ana? " + ana.ehAntecessora(mae));
        System.out.println("Rita (avó) é antecessora de Ana? " + ana.ehAntecessora(avoMaterna));
        System.out.println("José (avô) é antecessor de Ana? " + ana.ehAntecessora(avoPaterno));
        System.out.println("Bruno é antecessor de Ana? " + ana.ehAntecessora(bruno));
        System.out.println("Ana é antecessora de Carlos? " + pai.ehAntecessora(ana));
    }
}
