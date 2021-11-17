package m16stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
- Crie um lista com as seguintes linguagens:  Java, PHP, C#, JS, Scala, Java.
- Filtre somente as que contém "J"
- Imprima cada elemento (peek)
- Remova elementos duplicados
- Gere uma nova lista List<Stream> lista2 = lista1.stream().......
 */
public class ExercicioStreamLinguagens {

    public static void main(String[] args) {

        System.out.println("Linguagens (antes processamento): ");
        List<String> linguagens = Stream.of("Java", "PHP", "C#", "JS", "Scala", "Java")
                .filter(linguagem -> linguagem.contains("J"))
                .peek(System.out::println) //.peek(x -> System.out.println(x))
                .map(String::toUpperCase) //.map(linguagem -> linguagem.toUpperCase())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Linguagens (após processamento): ");
        linguagens.forEach(System.out::println);
    }
}
