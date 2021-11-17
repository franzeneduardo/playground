package m02.p01tipos;

/*
Exercício: Tipos primitivos

Vamos criar uma nova classe ExercicioTiposPrimitivos e um novo método main.
Com base nos tipos primitivos, vamos criar as seguintes variáveis:

    idade
    ano de nascimento
    o ano atual é bissexto?
    a primeira letra do seu sobrenome
    bandeira do cartão Master/Visa/Amex
    preço do dólar hoje em reais (pesquisar)
    população do Brasil (209,3 milhões)
    população mundial (7,7 bilhões)
    valor de Pi (3.141592653589793)

 */
public class ExercicioPrimitivos {
    public static void main(String[] args) {
        //    idade
        int idade = 34; // poderia ser short/byte

        //    ano de nascimento
        int anoNascimento = 1987;

        //    o ano atual é bissexto?
        boolean isAnoBissexto = true;

        //    a primeira letra do seu sobrenome
        char primeiraLetra = 'G';

        //    bandeira do cartão Master/Visa/Amex
        char bandeiraCartao = 'M';

        //    preço do dólar hoje em reais (pesquisar)
        float precoDolar = 5.48F;

        //    população do Brasil (209,3 milhões)
        int populacaoBrasil = 209_300_000;

        //    população mundial (7,7 bilhões)
        long populacaoMundial = 7_700_000_000L; // Precisa ser LONG

        //    valor de Pi (3.141592653589793)
        // com "ponto" é por padrão DOUBLE a menos que tenha o "F"
        double pi = 3.141592653589793;
        System.out.printf("Valor: %.15f", pi);
    }

}