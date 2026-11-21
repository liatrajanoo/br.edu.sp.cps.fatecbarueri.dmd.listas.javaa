package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio06.circulo;

import java.util.Objects;

/**
 * Representa um ponto no plano cartesiano.
 */
public class Ponto2D {

    private double x;
    private double y;

    /** Cria um ponto na origem (0, 0). */
    public Ponto2D() {
        this(0, 0);
    }

    /** Cria um ponto na posição (x, y). */
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /** Cria um ponto na mesma posição de outro ponto. */
    public Ponto2D(Ponto2D outro) {
        this(outro.x, outro.y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /** Move o ponto para a origem. */
    public void mover() {
        mover(0, 0);
    }

    /** Move o ponto para (x, y). */
    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /** Move o ponto para a posição de outro ponto. */
    public void mover(Ponto2D destino) {
        mover(destino.x, destino.y);
    }

    /** Distância euclidiana até outro ponto. */
    public double distancia(Ponto2D outro) {
        return Math.hypot(x - outro.x, y - outro.y);
    }

    /** Cria um novo ponto no mesmo local deste. */
    @Override
    public Ponto2D clone() {
        return new Ponto2D(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ponto2D outro = (Ponto2D) obj;
        // "+ 0.0" faz com que -0.0 seja tratado como 0.0
        return Double.compare(x + 0.0, outro.x + 0.0) == 0
                && Double.compare(y + 0.0, outro.y + 0.0) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x + 0.0, y + 0.0);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
