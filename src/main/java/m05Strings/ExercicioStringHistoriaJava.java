package m05Strings;

import java.util.Scanner;

/*
    Prática String - História do Java:
    - Leia um texto da entrada do usuário.
    - Substitua o termo "Java" por "*JAVA*".
    - Divida o texto em cada ponto final, criando um array de Strings.
    - Percorra o array, imprimindo cada String em uma linha.
    - Conte e imprima a quantidade de ocorrências da palavra "JAVA".

    Texto para teste:
    Java é uma linguagem de programação orientada a objetos desenvolvida na década de 90 por uma equipe de programadores chefiada por James Gosling, na empresa Sun Microsystems. Em 2008 o Java foi adquirido pela empresa Oracle Corporation. Diferente das linguagens de programação modernas, que são compiladas para código nativo, a linguagem Java é compilada para um bytecode que é interpretado por uma máquina virtual (Java Virtual Machine, mais conhecida pela sua abreviação JVM). A linguagem de programação Java é a linguagem convencional da Plataforma Java, mas não é a sua única linguagem. J2ME Para programas e jogos de computador, celular, calculadoras, ou até mesmo o rádio do carro.
 */
public class ExercicioStringHistoriaJava {

    public static void main(String[] args) {

        //String entrada = "Java é uma linguagem de programação orientada a objetos desenvolvida na década de 90 por uma equipe de programadores chefiada por James Gosling, na empresa Sun Microsystems. Em 2008 o Java foi adquirido pela empresa Oracle Corporation. Diferente das linguagens de programação modernas, que são compiladas para código nativo, a linguagem Java é compilada para um bytecode que é interpretado por uma máquina virtual (Java Virtual Machine, mais conhecida pela sua abreviação JVM). A linguagem de programação Java é a linguagem convencional da Plataforma Java, mas não é a sua única linguagem. J2ME Para programas e jogos de computador, celular, calculadoras, ou até mesmo o rádio do carro.";
        String entrada = new Scanner(System.in).nextLine(); // NextLine para ir até o fim da linha (enter).

        String entradaModificada = entrada.replaceAll("Java", "*JAVA*");

        //  Escape com barra dupla para caracteres especiais - \\.
        String[] partes = entradaModificada.split("\\."); // No REGEX "." é qualquer caractere

        System.out.println("Partes: ");
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);
        }

        int quantidadeOcorrencias = entradaModificada.split("JAVA").length - 1;
        System.out.println("Quantidade de ocorrências: " + quantidadeOcorrencias);

        int contaOcorrencias = contaOcorrenciasOutroExemplo(entradaModificada, "JAVA");
        System.out.println("Quantidade de ocorrências: " + contaOcorrencias);
    }

    public static int contaOcorrenciasOutroExemplo(String entradaModificada, String palavraASerEncontrada) {
        int count = 0;
        String[] textoSplit = entradaModificada.split("[*]");
        for (int i = 0; i < textoSplit.length; i++) {
            if (textoSplit[i].equals(palavraASerEncontrada)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static int contaOcorrencias(String entradaModificada, String palavraASerEncontrada) {
        int quantidadeOcorrencias = 0;
        int posicaoAtual = 0;

        while (posicaoAtual != -1) {
            posicaoAtual = entradaModificada.indexOf(palavraASerEncontrada, posicaoAtual + 1);
            if (posicaoAtual != -1) {
                System.out.println("Posição encontrada: " + posicaoAtual);
                quantidadeOcorrencias++;
            }
        }
        return quantidadeOcorrencias;
    }

}
