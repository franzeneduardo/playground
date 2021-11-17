package m16stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemplosStream {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Pedro", "Fabio");
        long countPessoas = nomes.stream()
                .filter(nome -> deveIncluirLista(nome)) // começou com todos, sobrou só Fabio
                .map( nome -> new Pessoa(nome)) // Começou com string e saiu pessoa
                .map( pessoa -> pessoa.getNome() ) // Começou com pessoa e saiu o nome
                .map( nome -> nome.toUpperCase() )// Começou com nome e saiu o nome upper
                .peek(nome -> System.out.println(nome)) // log
                .distinct() // Elemina duplicados
                .sorted()
                //.reduce((nomeA, nomeB) -> nomeA.concat(nomeB))
                .count();


        List<byte[]> lista = List.of("Alfabeto", "Palavras").stream()
                .map(palavra -> palavra.getBytes())
                .collect(Collectors.toList());

        var lista2 = List.of("Alfabeto", "Palavras").stream()
                .flatMap(frase -> Arrays.stream(frase.split(" ")))
                .collect(Collectors.toList());
    }


    private static boolean deveIncluirLista(String nome) {
        return nome.contains("a");
    }
}

class Pessoa{
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}