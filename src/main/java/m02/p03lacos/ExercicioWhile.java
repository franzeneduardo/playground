package m02.p03lacos;

import java.util.Scanner;

/*
    Pedir um número ao usuário.
    Percorrer até zero, imprimindo cada um dos números do intervalo. - while
 */
public class ExercicioWhile {

    public static void main(String[] args) {

        System.out.println("Informe um número: ");
        int numero = new Scanner(System.in).nextInt();

        while (numero >= 0){
            System.out.print(numero);
            if(numero != 0){
                System.out.print(",");
            }
            numero--;
        }

    }
}
