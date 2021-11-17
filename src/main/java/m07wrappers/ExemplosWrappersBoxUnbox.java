package m07wrappers;

public class ExemplosWrappersBoxUnbox {

    public static void main(String[] args) {
        //Unboxing Wrapper -> int
        int idade = Integer.valueOf(34); //new Integer(34)
        //Autoboxing int -> Wrapper
        Integer ano = 2021;

        //Criando uma Coleção
        Integer[] lista = new Integer[1];
        lista[0] = Integer.valueOf(25);
        Integer primeiroNumero = lista[0];

        Integer numero = Integer.parseInt("110");
        int temperatura = Integer.parseInt("34");

    }
}
