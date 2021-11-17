package m12colecoes;

import java.util.*;

/*
- A partir da lista/set campeoesPorAno:
- Crie um mapa chamado `quantidadeTitulos` onde a chave é o país e o valor
  é a quantidade de vezes que foi campeão.
- Percorra a lista criada, adicionando ao Map conforme achar necessário.
- Imprima o país e a quantidade de copas. O ano pode ser ignorado.

Campeoes:
List<String> campeoesPorAno = new ArrayList<String>();
campeoesPorAno.add("1930 - Uruguai"); // Adicionar todos assim
1934 - Itália
1938 - Itália
1950 - Uruguai
1954 - Alemanha
1958 - Brasil
1962 - Brasil
1966 - Inglaterra
1970 - Brasil
1974 - Alemanha
1978 - Argentina
1982 - Itália
1986 - Argentina
1990 - Alemanha
1994 - Brasil
1998 - França
2002 - Brasil
2006 - Itália
2010 - Espanha
2014 - Alemanha
2018 - França
 */
public class ExercicioMapas {
    public static void main(String[] args) {

        // Lista de Campeoes
        Set<String> campeoesPorAno = new LinkedHashSet<>();
        campeoesPorAno.add("1930 - Uruguai"); // Adicionar todos assim
        campeoesPorAno.add("1934 - Itália"); // Adicionar todos assim

        // ao final....
        Map<String, Integer> quantidadeTitulos = new LinkedHashMap<>();
        quantidadeTitulos.put("Espanha", 1); // só um exemplo de como tem que estar no final...

        System.out.println("Percorrendo entries:");
        for (Map.Entry<String, Integer> entry : quantidadeTitulos.entrySet()){
            System.out.printf("Pais: %s - Quantidade: %s \n", entry.getKey(), entry.getValue());
        }
    }
}