package m02.p05arrays;

import java.util.Scanner;

/*
Precisamos criar um algoritmo que:

Solicite (Scanner) e armazene em variável (Array) todos os valores de uma lista de compras.
Solicitar até o usuário informar 0. Após, mostrar a lista e a soma.

Ex:
Usuário informou 10.
Usuário informou 8.
Usuário informou 0.

Valores: [10, 8, 0]
Soma:    18.

Após:
- Usar incremento (indice++)
- Usar for each em vez do for tradicional
- Não mostrar valores zerados no for
 */
public class ExemploArray {

    public static void main(String[] args) {

        float[] valores = new float[2];
        int posicaoArray = 0;
        float soma = 0;

        while (true) {
            System.out.println("Informe o valor do item:");
            float valorItem = new Scanner(System.in).nextFloat();

            if(valorItem == 0F){
                break;
            }else{
                if(posicaoArray >= 2){
                    System.out.println("Excedeu o limite de valores!");
                    break;
                }
                valores[posicaoArray++] = valorItem;

                soma += valorItem; //soma = soma+valorItem;
            }
        }

        System.out.println("\n\nValores:\n");
        for (int count = 0; count < valores.length; count++){
            float valorAtual = valores[count];
            if(valorAtual == 0F){
                break;
            }
            System.out.println(valorAtual);
        }
        System.out.printf("Soma: %.2f", soma);

    }
}
