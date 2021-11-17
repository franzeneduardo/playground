package m12colecoes;

import java.util.*;

/*
Dada as linguagens: Java, PHP, C#, JS, Scala.

- Criar ArrayList adicionando cada um dos elementos.
- Buscar pela linguagem PHP (ver se existe)
- Obter primeiro elemento
- Obter a posição de Scala
- Imprimir com foreach
- Alterar para LinkedList (mais rápido em alterações, mas perde no acesso)
- Ordenar
- Adicionar BashScript
- Imprimir novamente para verificar ordenação
- Usar List.of
 */
public class ExemploList {

    public static void main(String[] args) {

        List<String> linguagens = new LinkedList<>();
        linguagens.add("Java");
        linguagens.add("PHP");
        linguagens.add("C#");
        linguagens.add("JS");
        linguagens.add("Scala");

        //Imutável
        List<String> linguagens2 = List.of("Java", "PHP", "C#", "JS", "Scala");
        List<String> linguagens3 = Arrays.asList("Java", "PHP", "C#", "JS", "Scala");

        //Lista com 1 elemento
        List<String> linguagens4 = Collections.singletonList("PHP");

        //Mutável
        List<String> linguagens5 =
                new ArrayList<>(List.of("Java", "PHP", "C#", "JS", "Scala"));
        linguagens5.add("BashScript");

        for( String ling : linguagens){
            System.out.println(ling);
        }

        System.out.println("Tem PHP? " + linguagens.contains("PHP"));
        System.out.println("Primeiro elemento? " + linguagens.get(0));
        System.out.println("Posição Scala? " + linguagens.indexOf("Scala"));

        Collections.sort(linguagens);

        System.out.println("Ordenado: ");
        for( String ling : linguagens){
            System.out.println(ling);
        }

        linguagens.add("BashScript");

        System.out.println("Ordenado? ");
        for( String ling : linguagens){
            System.out.println(ling);
        }

    }

}
