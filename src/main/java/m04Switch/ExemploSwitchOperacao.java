package m04Switch;


import java.util.Scanner;

/*
Precisamos criar um algoritmo que:

Obtenha a taxa do cartão de crédito de acordo com o tipo de operação:

 - C: 6.89% (Crédito) - Exemplo: valor * 0,698
 - D: 2.99% (Débito)
 - P: 0% (Pix)
 - Outros Tipos: 1%

Após:
- Refatorar para ser um método à parte com argumentos.
 */
public class ExemploSwitchOperacao {

    public static void main(String[] args) {

        new Scanner(System.in);

        char tipoDeOperacao = 'C';
        float taxa = 0;

        switch (tipoDeOperacao){
            case 'C':
                taxa = 6.89F;
                break;
            case 'D':
                taxa = 2.99F;
                break;
            case 'P':
                taxa = 0;
                break;
            default:
                taxa = 1;
        }

        System.out.printf("A taxa para o tipoDeOperacao %s é %.2f.", tipoDeOperacao, taxa);

    }
}
