package m02.p03lacos;

import java.util.Scanner;

/**
 * Exemplo FOR:
 *
 * Ler número de 2 a 9.
 * Esse número é para a taboada.
 * Informar a taboada desse número.
 *
 * Exemplo DO-WHILE:
 *
 * Ler número.
 * Esse número é uma senha.
 * Perguntar até que seja informado a 12345. - dowhile
 */
public class ExemplosLacos {

    public static void main(String[] args) {

        int senha;
        do {
            System.out.println("Informe sua senha:");
            senha = new Scanner(System.in).nextInt();
            System.out.printf("Senha informada: %s\n", senha);

        } while (senha != 1);

//        for (int contador = 2; contador <= 9 ; contador++){
//            int multi = contador*7;
//            System.out.printf("7 x %d = %d\n", contador, multi);
//        }

    }

    private static void exemploBlocos() {
        int valor = 1;
        {
            {
                System.out.println(valor);
            }
        }
    }
}
