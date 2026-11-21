package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio03.numerocomplexo;

/*
 * Lista 1 - Exercício 3
 * Classe NumeroComplexo com somar, subtrair, multiplicar, dividir (alteram o número
 * que recebeu a mensagem), equals, toString e módulo.
 * Exemplos de módulo: |3 + 4i| = 5 e |6 - 8i| = 10.
 */
public class Main {
    public static void main(String[] args) {
        NumeroComplexo a = new NumeroComplexo(3, 4);
        NumeroComplexo b = new NumeroComplexo(1, -2);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("parte real de a = " + a.getReal() + ", parte imaginária de a = " + a.getImaginario());

        NumeroComplexo r = new NumeroComplexo(a.getReal(), a.getImaginario());
        r.somar(b);
        System.out.println("(" + a + ") + (" + b + ") = " + r);

        r = new NumeroComplexo(a.getReal(), a.getImaginario());
        r.subtrair(b);
        System.out.println("(" + a + ") - (" + b + ") = " + r);

        r = new NumeroComplexo(a.getReal(), a.getImaginario());
        r.multiplicar(b);
        System.out.println("(" + a + ") * (" + b + ") = " + r);

        r = new NumeroComplexo(a.getReal(), a.getImaginario());
        r.dividir(b);
        System.out.println("(" + a + ") / (" + b + ") = " + r);

        try {
            new NumeroComplexo(1, 1).dividir(new NumeroComplexo(0, 0));
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero tratada: " + e.getMessage());
        }

        System.out.println("a.equals(3 + 4i) = " + a.equals(new NumeroComplexo(3, 4)));
        System.out.println("a.equals(b) = " + a.equals(b));

        NumeroComplexo z1 = new NumeroComplexo(3, 4);
        NumeroComplexo z2 = new NumeroComplexo(6, -8);
        System.out.println("|" + z1 + "| = " + z1.modulo());
        System.out.println("|" + z2 + "| = " + z2.modulo());

        a.setReal(10);
        a.setImaginario(-1);
        System.out.println("após setters: a = " + a);
    }
}
