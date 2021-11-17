package m04Switch;

import java.util.Scanner;

/*
Precisamos criar um algoritmo que:

Exercício 1:
Considerando as áreas de DDD do RS, a partir do código, informe/imprima a região:
51 - Região Metropolitana de Porto Alegre.
53 - Pelotas e Região.
54 - Caxias do Sul e Região.
55 - Santa Maria e Região.
Outros - Região não identificada

Exercício 2:
Considerando as áreas de DDD, a partir do código, informe/imprima o estado:
48 - Santa Catarina
49 - Santa Catarina
51 - Rio Grande do Sul
53 - Rio Grande do Sul
45 - Paraná
46 - Paraná
Outros - Estado não identificado

Após:
- Refatorar para ser um método à parte com argumentos.
- Refatorar para não duplicar os estados
- Refatorar para retornar uma "String".
 */
public class ExercicioSwitchDDD {

    public static void main(String[] args) {
        System.out.println("Informe o DDD: ");
        int ddd = new Scanner(System.in).nextInt();
        String regiao = obterRegicaoAPartirDo(ddd);
        String estado = obterEstadoPartirDo(ddd);
        System.out.printf("DDD: %d - Estado: %s - Região: %s", ddd, estado, regiao);
    }

    private static String obterEstadoPartirDo(int ddd){
        switch (ddd) {
            case 48:
            case 49:
                return "Santa Catarina";
            case 51:
            case 53:
                return "Rio Grande do Sul";
            case 45:
            case 46:
                return "Paraná";
            default:
                return "Outros - Estado não identificado";
        }
    }

    private static String obterRegicaoAPartirDo(int ddd){
        switch (ddd) {
            case 51:
                return "Região Metropolitana de Porto Alegre";
            case 53:
                return "Pelotas e Região";
            case 54:
                return "Caxias do Sul e Região";
            case 55:
                return "Santa Maria e Região";
            default:
                return "Outros - Região não identificada";
        }
    }

}
