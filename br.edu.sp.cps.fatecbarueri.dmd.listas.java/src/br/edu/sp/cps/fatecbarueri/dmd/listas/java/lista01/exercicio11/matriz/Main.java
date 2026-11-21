package br.edu.sp.cps.fatecbarueri.dmd.listas.java.lista01.exercicio11.matriz;

/*
 * Lista 1 - Exercício 11
 * Classe Matriz com construtor de dimensões, acesso a elementos, comparação, transposta,
 * oposta, matriz nula, testes (identidade, diagonal, singular, simétrica, anti-simétrica),
 * somar, subtrair, multiplicar (alteram a matriz que recebeu a mensagem) e cópia.
 */
public class Main {

    private static Matriz criar(double[][] valores) {
        Matriz m = new Matriz(valores.length, valores[0].length);
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                m.set(i, j, valores[i][j]);
            }
        }
        return m;
    }

    private static void mostrar(String titulo, Matriz m) {
        System.out.println(titulo + " (" + m.getLinhas() + "x" + m.getColunas() + "):");
        System.out.println(m);
        System.out.println();
    }

    public static void main(String[] args) {
        Matriz a = criar(new double[][] {{1, 2, 3}, {4, 5, 6}});
        mostrar("A", a);
        System.out.println("A[1][2] = " + a.get(1, 2));
        a.set(1, 2, 7);
        System.out.println("após set(1, 2, 7): A[1][2] = " + a.get(1, 2));
        a.set(1, 2, 6);
        System.out.println();

        mostrar("Transposta de A", a.transposta());
        mostrar("Oposta de A", a.oposta());
        mostrar("Matriz nula com as dimensões de A", a.gerarNula());

        Matriz copia = a.clone();
        System.out.println("Cópia de A é igual a A? " + copia.equals(a) + " (mesmo objeto? " + (copia == a) + ")");
        copia.set(0, 0, 99);
        System.out.println("Após alterar a cópia, igual a A? " + copia.equals(a));
        System.out.println();

        Matriz identidade = criar(new double[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}});
        Matriz diagonal = criar(new double[][] {{2, 0, 0}, {0, 3, 0}, {0, 0, 4}});
        Matriz singular = criar(new double[][] {{5, 0, 0}, {0, 5, 0}, {0, 0, 5}});
        Matriz simetrica = criar(new double[][] {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}});
        Matriz antiSimetrica = criar(new double[][] {{0, 2, -3}, {-2, 0, 4}, {3, -4, 0}});

        String[] nomes = {"identidade", "diagonal", "singular", "simétrica", "anti-simétrica", "A (2x3)"};
        Matriz[] ms = {identidade, diagonal, singular, simetrica, antiSimetrica, a};
        System.out.println("matriz          | ident. | diag. | singular | simétr. | anti-simétr.");
        for (int i = 0; i < ms.length; i++) {
            System.out.printf("%-15s | %-6b | %-5b | %-8b | %-7b | %b%n", nomes[i],
                    ms[i].ehIdentidade(), ms[i].ehDiagonal(), ms[i].ehSingular(),
                    ms[i].ehSimetrica(), ms[i].ehAntiSimetrica());
        }
        System.out.println();

        Matriz b = criar(new double[][] {{10, 20, 30}, {40, 50, 60}});
        Matriz soma = a.clone();
        soma.somar(b);
        mostrar("A + B", soma);

        Matriz dif = b.clone();
        dif.subtrair(a);
        mostrar("B - A", dif);

        Matriz c = criar(new double[][] {{1, 0}, {0, 1}, {2, 2}});
        Matriz prod = a.clone();
        prod.multiplicar(c);
        mostrar("A x C (A passa a guardar o resultado)", prod);

        try {
            a.somar(c);
        } catch (IllegalArgumentException e) {
            System.out.println("Dimensões incompatíveis: " + e.getMessage());
        }
        try {
            a.multiplicar(a);
        } catch (IllegalArgumentException e) {
            System.out.println("Multiplicação incompatível: " + e.getMessage());
        }
    }
}
