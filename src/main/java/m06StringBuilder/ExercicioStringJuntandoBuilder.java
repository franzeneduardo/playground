package m06StringBuilder;

import java.util.Scanner;

/*
Prática StringBuilder:

- Faça um laço (do-while) lendo Strings até que seja informado o texto "sair".
- Em cada iteração, peça ao usuário que informe um texto (leia com Scanner).
- Junte cada texto informado com o StringBuffer.
- Quando o usuário informar o "sair", imprima o texto concatenado (toString).

 */
public class ExercicioStringJuntandoBuilder {

    public static void main(String[] args) {

        StringBuffer textoBuffer = new StringBuffer();
        do {
            System.out.println("Informe um texto:");
            String texto = new Scanner(System.in).nextLine();

            if(texto != null && !"sair".equals(texto)){
               break;
            }
//            textoBuffer.append(texto);
//            textoBuffer.append(" ");
            textoBuffer.append(texto).append(" ");

        } while (true);

        System.out.println(textoBuffer.toString());
    }

}