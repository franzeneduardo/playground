package m17optional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploStreamOptionalFindFirst {

    public static void main(String[] args) {

        String ling = Stream.of("Java", "PHP", "C#", "JS", "Scala", "Java")
                .parallel() // Torna paralelo (com algumas configs a mais)
                .filter(linguagem -> linguagem.contains("X"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .findAny() //Semelhante ao findFirst, só varia se for processamento paralelo
                            // onde o primeiro a ser processado nem sempre é o primeiro da lista
                .orElse("Ruby");

        System.out.println("Linguagens (após processamento): ");
        System.out.println(ling);
    }
}
