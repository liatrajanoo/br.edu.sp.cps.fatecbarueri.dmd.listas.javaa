package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio04.reta;

/**
 * Representa uma reta no plano: y = ax + b.
 */
public class Reta {

    private static final double TOLERANCIA = 1e-9;

    private final double a; // coeficiente angular
    private final double b; // coeficiente linear

    /** Cria a reta y = ax + b a partir dos coeficientes angular e linear. */
    public Reta(double coeficienteAngular, double coeficienteLinear) {
        this.a = coeficienteAngular;
        this.b = coeficienteLinear;
    }

    /**
     * Cria a reta que passa por dois pontos.
     * Lança IllegalArgumentException se os pontos tiverem o mesmo x (reta vertical,
     * que não pode ser escrita na forma y = ax + b).
     */
    public Reta(Ponto2D p1, Ponto2D p2) {
        if (Math.abs(p1.getX() - p2.getX()) < TOLERANCIA) {
            throw new IllegalArgumentException(
                    "Os pontos têm o mesmo x (reta vertical): não é possível representar como y = ax + b.");
        }
        this.a = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        this.b = p1.getY() - this.a * p1.getX();
    }

    public double getCoeficienteAngular() {
        return a;
    }

    public double getCoeficienteLinear() {
        return b;
    }

    /** Verifica se o ponto pertence à reta (com tolerância numérica). */
    public boolean contem(Ponto2D p) {
        return Math.abs(p.getY() - (a * p.getX() + b)) < TOLERANCIA;
    }

    /**
     * Ponto de interseção com outra reta, ou null se forem paralelas
     * (mesmo coeficiente angular).
     */
    public Ponto2D intersecao(Reta outra) {
        if (Math.abs(this.a - outra.a) < TOLERANCIA) {
            return null;
        }
        double x = (outra.b - this.b) / (this.a - outra.a);
        double y = this.a * x + this.b;
        return new Ponto2D(x, y);
    }

    /** Representação "y = ax + b". */
    @Override
    public String toString() {
        if (b < 0) {
            return "y = " + a + "x - " + (-b);
        }
        return "y = " + a + "x + " + b;
    }
}
