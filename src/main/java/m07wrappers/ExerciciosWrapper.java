package m07wrappers;

/*
Exercício 1:
    Sendo o limite de 22.5 kg para cada mala no aeroporto, dados três pesos de malas,
    escreva a frase apropriada para cada um dos casos, se possível utilizando classes wrapper!
    Menor que 22.5:     Peso abaixo do limite.
    Igual a 22.5:       Peso máximo atingido.
    Maior que 22.5:     Excesso de peso, haverá cobrança de adicional.

Casos de teste:
    22.5    // Peso máximo
    15      // Abaixo
    30.2    //Excedente

Exercício 2:
    Crie uma função que recebe uma classe Character (pressupondo que seja uma letra maiúscula)
    e converta a mesma para minúscula. Não utilize recursos da String.
    OBS: Pode ser útil consultar a tabela ASCII:
    https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/ASCII-Table.svg/738px-ASCII-Table.svg.png

Exercício 3:
    Converta o seguinte array de números nas suas respectivas letras do ASCII e transforme em um Array de Strings.
    Após, imprima o texto resultante.
 */
public class ExerciciosWrapper {

    public static void main(String[] args) {
        int[] arrayDeNumeros = {86, 99, 32, 101, 104, 32, 100, 101, 109, 97, 105,
                115, 33, 32, 83, 117, 97, 32, 114, 101, 115, 111, 108, 117, 99, 97,
                111, 32, 101, 115, 116, 97, 104, 32, 99, 111, 114, 114, 101, 116, 97,
                33, 33, 32, 78, 97, 111, 32, 99, 111, 110, 116, 101, 32, 97, 111, 115,
                32, 100, 101, 109, 97, 105, 115, 32, 58, 41};

        for (int i = 0; i < arrayDeNumeros.length; i++) {
            //Converte de int para char utilizando a tabela "ASCII"
            //System.out.println((char) arrayDeNumeros[0]);
            System.out.println(Character.toChars(arrayDeNumeros[i]));
        }

    }

}