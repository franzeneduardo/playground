package m02.p03lacos;

/*
Desafio: Prática de Comandos II - Resolva os desafios:

- Some 1 até 1000 (some 0+1+2+3...1000) e imprima cada cálculo no console utilizando for.
- Imprima todos os múltiplos de 3, entre 1 e 100 utilizando for.
- Imprima os fatoriais de 1 a 10 utilizando for ou while.

OBS: Fatorial:

Representado por n!, o fatorial de um número é calculado pela multiplicação
desse número por todos os seus antecessores até chegar ao número 1.
O fatorial de 0 e 1 é 0.
A partir de 1 o fatorial é o fatorial do número anterior * o número atual.
 */
public class UmDesafioLacos {

    public static void main(String[] args) {
        soma();
        multiplos3();
        multiplos3Master();
        fatorial();
    }

    private static void fatorial() {
        int fatorial = 1;

        for( int i = 1; i <= 10; i++ ) {
            fatorial *= i;
            System.out.printf(" %d! = %d\n", i, fatorial);
        }

    }

    private static void multiplos3() {
        for (int count = 1; count <= 100; count++) {

            boolean multiploDe3 = count % 3 == 0;
            if (multiploDe3) {
                System.out.println(count);
            }
        }
    }

    private static void multiplos3Master() {
        for (int count = 3; count <= 100; count = count + 3) {
            System.out.println(count);
        }
    }

    private static void soma() {

        int soma = 0;
        for (int count = 1; count <= 1000; count++) {
            int valorAnterior = soma; // copiando o valor da soma para o valorAnterior.
            soma += count; //soma+count
            System.out.printf("%d + %d = %d\n", count, valorAnterior, soma);
        }

    }

}