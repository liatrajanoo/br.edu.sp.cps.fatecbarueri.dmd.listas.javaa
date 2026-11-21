package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio03.numerocomplexo;

import java.util.Objects;

/**
 * Representa um número complexo a + bi.
 */
public class NumeroComplexo {

    private double real;
    private double imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    /** (a+bi) + (c+di) = (a+c) + (b+d)i. Altera este número. */
    public void somar(NumeroComplexo outro) {
        this.real = this.real + outro.real;
        this.imaginario = this.imaginario + outro.imaginario;
    }

    /** (a+bi) - (c+di) = (a-c) + (b-d)i. Altera este número. */
    public void subtrair(NumeroComplexo outro) {
        this.real = this.real - outro.real;
        this.imaginario = this.imaginario - outro.imaginario;
    }

    /** (a+bi) * (c+di) = (ac-bd) + (ad+bc)i. Altera este número. */
    public void multiplicar(NumeroComplexo outro) {
        double novoReal = this.real * outro.real - this.imaginario * outro.imaginario;
        double novoImaginario = this.real * outro.imaginario + this.imaginario * outro.real;
        this.real = novoReal;
        this.imaginario = novoImaginario;
    }

    /**
     * (a+bi) / (c+di) = (ac+bd)/(c2+d2) + (bc-ad)/(c2+d2)i. Altera este número.
     * Lança ArithmeticException se o divisor for 0 + 0i.
     */
    public void dividir(NumeroComplexo outro) {
        double denominador = outro.real * outro.real + outro.imaginario * outro.imaginario;
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por número complexo zero.");
        }
        double novoReal = (this.real * outro.real + this.imaginario * outro.imaginario) / denominador;
        double novoImaginario = (this.imaginario * outro.real - this.real * outro.imaginario) / denominador;
        this.real = novoReal;
        this.imaginario = novoImaginario;
    }

    /** Módulo |z| = raiz(a2 + b2). */
    public double modulo() {
        return Math.hypot(real, imaginario);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NumeroComplexo outro = (NumeroComplexo) obj;
        return Double.compare(real + 0.0, outro.real + 0.0) == 0
                && Double.compare(imaginario + 0.0, outro.imaginario + 0.0) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real + 0.0, imaginario + 0.0);
    }

    /** Representação "a + bi" (ou "a - bi" quando a parte imaginária é negativa). */
    @Override
    public String toString() {
        if (imaginario < 0) {
            return real + " - " + (-imaginario) + "i";
        }
        return real + " + " + imaginario + "i";
    }
}
