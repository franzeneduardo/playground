package m02.p04extras;

public class ExemploIncrementDecrementOperators {
    public static void main(String[] args) {

        int ano = 2021;
        System.out.println(ano);
        System.out.println(ano++); // imprime o valor anterior (2021, mas incrementa para 2022)
        System.out.println(++ano); // incrementa para 2023 e depois imprime.

        ano++; // só incremento para 2024
        System.out.println(ano); // só imprimo o valor atualizado (2024)

        /*
        ++ano: primeiro INCREMENTA, depois usa o valor
        ano++: primeiro usa o valor, depois INCREMENTA
         */
    }
}
