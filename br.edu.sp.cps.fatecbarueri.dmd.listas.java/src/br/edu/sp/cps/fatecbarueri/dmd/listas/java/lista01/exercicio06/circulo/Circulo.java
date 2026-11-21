package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio06.circulo;

/**
 * Representa um círculo no plano cartesiano.
 */
public class Circulo {

    private double raio;
    private final Ponto2D centro;

    /** Cria um círculo com o raio e o centro indicados. */
    public Circulo(double raio, Ponto2D centro) {
        validarRaio(raio);
        this.raio = raio;
        this.centro = new Ponto2D(centro);
    }

    /** Cria um círculo com o raio indicado, centrado na origem. */
    public Circulo(double raio) {
        this(raio, new Ponto2D());
    }

    private static void validarRaio(double raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("O raio não pode ser negativo.");
        }
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        validarRaio(raio);
        this.raio = raio;
    }

    public Ponto2D getCentro() {
        return new Ponto2D(centro);
    }

    /** Aumenta o raio do valor indicado. */
    public void inflar(double valor) {
        setRaio(raio + valor);
    }

    /** Diminui o raio do valor indicado (o raio não pode ficar negativo). */
    public void desinflar(double valor) {
        setRaio(raio - valor);
    }

    /** Aumenta o raio em uma unidade. */
    public void inflar() {
        inflar(1);
    }

    /** Diminui o raio em uma unidade. */
    public void desinflar() {
        desinflar(1);
    }

    /** Leva o círculo para a origem. */
    public void mover() {
        centro.mover();
    }

    /** Leva o círculo para a posição (x, y). */
    public void mover(double x, double y) {
        centro.mover(x, y);
    }

    /** Leva o círculo para a posição de outro ponto. */
    public void mover(Ponto2D destino) {
        centro.mover(destino);
    }

    /** Área do círculo: pi * raio2. */
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo[raio=" + raio + ", centro=" + centro + "]";
    }
}
