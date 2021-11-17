package m02.p03lacos;

import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args) {

        // WHILE
        exemplo1De2021Ate2050();
        exemplo2De0AteONumeroEscolhido();
    }

    private static void exemplo2De0AteONumeroEscolhido() {
        int inicio = 0;
        System.out.println("Informe um número: ");
        int fim = new Scanner(System.in).nextInt();

        while (inicio < fim){
            System.out.printf("Valor atual: %d \n", inicio++);
        }
    }

    private static void exemplo1De2021Ate2050() {
        int ano = 2021;

        while (ano < 2050){
            System.out.printf("Ano: %d \n", ano);
            ano++; //ano = ano+1;
        }
    }
}
