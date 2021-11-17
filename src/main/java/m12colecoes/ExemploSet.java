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
public class ExemploSet {

    public static void main(String[] args) {

        Set<String> linguagens = new LinkedHashSet<>();
        linguagens.add("Java");
        linguagens.add("PHP");
        linguagens.add("C#");
        linguagens.add("JS");
        linguagens.add("Scala");
        linguagens.add("Java");
        linguagens.add("JS");

        for( String ling : linguagens){
            System.out.println(ling);
        }

        System.out.println("Tem PHP? " + linguagens.contains("PHP"));
        //Não tem posicional no SET
        //        System.out.println("Primeiro elemento? " + linguagens.get(0));
        //        System.out.println("Posição Scala? " + linguagens.indexOf("Scala"));

        //Ordenação pode ser feita pelo TreeSet
        //        Collections.sort(linguagens);

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
