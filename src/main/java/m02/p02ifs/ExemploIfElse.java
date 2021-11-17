package m02.p02ifs;

/*
- Ler número, escrever se é ímpar ou par.

- Ler número, escrever se é zero, positivo ou negativo.

- Ler número. Esse número é uma idade:
    Se menor que 12 escrever "Criança".
    Se entre 12 e 18 escrever "Adolescente".
    Se maior que 18 esrever "Adulto".

 */
public class ExemploIfElse {

    //main - atalho psvm
    public static void main(String[] args) {

        int numero = 2;

        if(numero % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }

        //Outra forma:
//        boolean expressao = numero % 2 == 0;
//        if(expressao){

        //Ler número, escrever se é zero, positivo ou negativo.

        int outroNumero = 20;

        if(outroNumero == 0){
            System.out.println("Número igual a zero");
        } else if(outroNumero == 1){
            System.out.println("Primeiro");
        } else if(outroNumero > 0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }


    }

}