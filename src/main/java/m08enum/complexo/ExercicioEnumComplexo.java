package m08enum.complexo;

import java.util.Scanner;

/*
Exercício:

1 - Crie um novo enum ImpostoMedioProduto com as modalidades e atributos:

Pão Francês	16,86% - PAO_FRANCES, 16.86F
Arroz	    17,24%
Feijão	    17,24%
Fermento	38,48%
Pizza	    36,54%
Manteiga	33,77%
Cerveja 	42,69%
Vinho 	    69,73%

- Peça para o usuário informar o produto e devolva a taxa do mesmo.
*/
public class ExercicioEnumComplexo {

    public static void main(String[] args) {
        System.out.println("Informe o nome do produto: ");
        String produto = new Scanner(System.in).nextLine();

        ImpostoMedioProduto[] impostos = ImpostoMedioProduto.values();

        for (int i = 0; i < impostos.length; i++) {

            ImpostoMedioProduto imposto = impostos[i];
            if(imposto.name().equalsIgnoreCase(produto) || imposto.getProduto().equalsIgnoreCase(produto)){

                System.out.printf("Produto: %s - Taxa: %.2f%%", imposto.getProduto(), imposto.getTaxa());
            }
        }
    }
}