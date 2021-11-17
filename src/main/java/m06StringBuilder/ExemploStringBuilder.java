package m06StringBuilder;

import java.util.Scanner;

public class ExemploStringBuilder {

    public static void main(String[] args) {

        System.out.println("Informe o local: ");
        String empresa = new Scanner(System.in).nextLine();

        StringBuilder textoBuilder = new StringBuilder()
                .append("Estou fazendo o curso ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o curso: ");
            String curso = new Scanner(System.in).nextLine();
            textoBuilder.append(curso).append(" ");
        }

        String texto = textoBuilder
                .append(" na ")
                .append(empresa)
                .toString();

        System.out.println(texto);
    }
}
