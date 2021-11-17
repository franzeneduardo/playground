package m02.p05arrays;

import java.util.Scanner;

/*
Precisamos criar um algoritmo que:

Solicite (Scanner) e armazene em variável (Array) 5 valores inteiros de uma lista de tempos.
Solicitar até o usuário informar os 5 números.
Após, mostrar a lista e o valor do maior tempo.

Ex:
Usuário informou 78.
Usuário informou 17.
Usuário informou 90.
Usuário informou 1.
Usuário informou 7.

Valores: [78, 17, 90, 1, 7]
Maior tempo: 90.

Após:
- Usar incremento (indice++)
 */
public class ExercicioArray {

    public static void main(String[] args) {
//        versao1();
        versao2();
    }

    private static void versao2() {
        int[] tempos = new int[5];

        for (int count = 0; count < 5; count++) {
            System.out.println("Informe um tempo: ");
            int tempo = new Scanner(System.in).nextInt();
            tempos[count] = tempo;
        }

        int maiorTempo = tempos[0];

        for (int count = 0; count < 5; count++) {

            if (tempos[count] > maiorTempo) {
                maiorTempo = tempos[count];
            }

            System.out.printf("O usuário informou: %d\n", tempos[count]);
        }
        System.out.printf("Maior tempo encontrado: %d", maiorTempo);
    }

    private static void versao1() {
        int[] tempos = new int[5];
        int maiorTempo = 0;

        for (int count = 0; count < 5; count++) {
            System.out.println("Informe um tempo: ");
            int tempo = new Scanner(System.in).nextInt();
            tempos[count] = tempo;

            if (count == 0 || tempo > maiorTempo) {
                maiorTempo = tempo;
            }

            System.out.printf("O usuário informou: %d\n", tempos[count]);
        }
        System.out.printf("Maior tempo encontrado: %d", maiorTempo);

        //System.out.println(Arrays.toString(tempos));
    }

}