package m02.p01tipos;

import java.util.Locale;

/*
Exemplos de primitivos:

- Ano das Olimpiadas
- Irá Chover Amanha? (sim/não)
- Valor da Taxa Selic
- Valor pago de imposto anual
- Primeira letra do seu nome
- Pessoa Jurídica vs Pessoa Física
- dados binários, por exemplo, conteúdo de um documento de música mp3
 */
public class ExemplosPrimitivos {

    public static void main(String[] args){

        short anoOlimpiadas = 2020;
        //souf - System.out.printf("")
        System.out.printf("Ano Olimpíadas: %d\n", anoOlimpiadas);

        boolean iraChoverAmanha = false;
        System.out.printf("Chove? %b\n", iraChoverAmanha);

        float taxaSelic = 6.25f; //precisamos do F, pois por padrão é double
        System.out.printf("Valor da Taxa Selic: %.2f\n", taxaSelic);

        /*
        %b - boolean (true/false)
        %s - Strings - texto
        %d - inteiros (int,short,long)
        %f - ponto flutuante (double/float)
         */
        double impostoAnual = 9_876_543d; //Pode usar o separador de milhar "_"
        System.out.printf("Valor pago de imposto anual: %.2f\n", impostoAnual);

        char primeiraLetra = 'G';
        System.out.printf("Primeira letra do seu nome: %s\n", primeiraLetra);

        char tipoPessoa = 'F'; // 'J'
        System.out.printf("Pessoa Jurídica vs Pessoa Física: %s\n", tipoPessoa);
//        - dados binários, por exemplo, conteúdo de um documento de música mp3

        byte pdf = 0; // Normalmente um array byte[]
        System.out.printf("Conteúdo arquivo: %s", pdf); //não é tão simples, mas to simplificando :)
    }
}
