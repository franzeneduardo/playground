package m12colecoes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Dadas as capitais:
    "RS", "Porto Alegre"
    "SC", "Florianópolis"
    "PR", "Curitiba"

- Criar map, sendo a chave o estado e o valor a capital.
- Obter a capital do "RS".
- Imprimir a lista de Capitais.
- Imprimir a lista de Estados.
- Imprimir a lista no formato: "Estado -> Capital"

- Explorar chave vazia, nula e duplicada.
 */
public class ExemploMap {

    public static void main(String[] args) {

        Map<String, String> capitais1 = Map.of(
                "RS", "Porto Alegre",
                "SC", "Florianópolis",
                "PR", "Curitiba");

        Map<String, String> capitais = new LinkedHashMap<>();
        capitais.put("RS", "Bagé"); // PUT substitui, enquanto o ADD sempre colocava no final da lista.
        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianópolis");
        capitais.put("PR", "Curitiba");
        capitais.put(null, "Rio Branco"); // Funciona no HashMap e LinkedHashMap
        capitais.put(null, "Passo Fundo"); // Substitui o valor anterior do null (Rio Branco)
        capitais.put("AC", null);

        System.out.println("Percorrendo chaves:");
        for (String sigla : capitais.keySet()){
            System.out.println(sigla);
        }

        System.out.println("Percorrendo valores:");
        for (String cidade : capitais.values()){
            System.out.println(cidade);
        }

        System.out.println("Percorrendo entries:");
        for (Map.Entry<String, String> entry : capitais.entrySet()){
            System.out.printf("Sigla: %s - Cidade: %s \n", entry.getKey(), entry.getValue());
        }

        System.out.println("Capital do RS: " +capitais.get("RS"));
        System.out.println("Removido RS? " +capitais.remove("RS")); // Toma aqui e remove
        System.out.println("Contains RS? " +capitais.containsKey("RS"));
        System.out.println("Contains Rio Branco? " +capitais.containsValue("Rio Branco"));
    }

}