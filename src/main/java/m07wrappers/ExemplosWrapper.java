package m07wrappers;

/*
Exemplos:

- Dado uma string "1", vamos obter o valor inteiro presente na String.
- Dado o valor primitivo 67.5, vamos obter uma classe Wrapper correspondente.
- Dado duas variáveis Float com valor 58.3, como comparar se são iguais?
- Dado duas variáveis: Float com valor 37.0 e outra Integer com valor 37 - como comparar se são iguais?
- Quantos estados possíveis podemos ter em um Boolean?
- O que o número 65 e o A tem em comum?

OBS: Pode ser útil consultar a seguinte tabela: https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/ASCII-Table.svg/738px-ASCII-Table.svg.png

 */
public class ExemplosWrapper {

    public static void main(String[] args) {

        //Forma errada de comparação com ==
        Float valorA = Float.valueOf(58.3F);
        Float valorB = Float.valueOf(58.3F);

        System.out.println("valorA == valorB: "+ (valorA == valorB));
        System.out.println("valorA.equals(valorB): "+ valorA.equals(valorB));
        System.out.println("valorA.compareTo(valorB): "+ valorA.compareTo(valorB)); //0 quer dizer igual!

        int numero1 = Integer.parseInt("1");
        double valor = Double.parseDouble("67.5");

        System.out.println("Float.valueOf(\"58.3\").compareTo(58.3F): " + Float.valueOf("58.3").compareTo(58.3F));

        //Dado duas variáveis: Float com valor 37.0 e outra Integer com valor 37 - como comparar se são iguais?
        float temperaturaA = 37.0F;
        int temperaturaB = 37;

        System.out.println("temperaturaA == temperaturaB: "
                + (temperaturaA == temperaturaB));//true

        Float temperaturaC = 37.0F;
        Integer temperaturaD = 37;

        //Nunca comparar com EQUALS tipos diferentes! Sempre é FALSE
        System.out.println("temperaturaC.equals(temperaturaD): "
                + (temperaturaC.equals(temperaturaD))); //false

        Float temperaturaE = 37.0F;
        int temperaturaF = 37;

        // Faz unboxing e acaba comparando dois PRIMITIVOS
        System.out.println("temperaturaE == temperaturaF: "
                + (temperaturaE == temperaturaF)); //true

        Float temperaturaG = 37.0F;
        Integer temperaturaH = 37;

        System.out.println("temperaturaG.intValue() == temperaturaH.intValue(): "
                +  ( temperaturaG.intValue() == temperaturaH.intValue() ) ); //true

        //- Quantos estados possíveis podemos ter em um Boolean?
        Boolean booleanA = true;
        Boolean booleanB = false;
        Boolean booleanC = null;

        // - O que o número 65 e o A tem em comum?

        System.out.println(65);
        // Conversão de INT para CHAR faz com que use a tabela ASC!
        System.out.println( (char) 65); //CAST com parênteses na frente da variável
        System.out.println(Character.toChars(65));

        // Conversão de CHAR para INT faz com que use a tabela ASC!
        System.out.println( (int) 'A');
    }
}