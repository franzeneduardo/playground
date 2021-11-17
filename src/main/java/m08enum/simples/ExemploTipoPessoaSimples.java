package m08enum.simples;

import java.util.Scanner;

public class ExemploTipoPessoaSimples {

    public static void main(String[] args) {

        //Pego os valores?
        TipoPessoa[] tipos = TipoPessoa.values();

        for (int i = 0; i < tipos.length; i++) {
            TipoPessoa tipo = tipos[i];
            System.out.println("Tipo: " + tipo.name() + " Posição: "+ tipo.ordinal());
        }

        //Atribuir um dos tipos FIXOS a uma variável, só com ENUM.
        TipoPessoa variavelTipoPessoa = TipoPessoa.FISICA;

        // A partir de uma string, queremos o enum
        System.out.println("Informe o tipo pessoa: ");
        String tipoEscolhido = new Scanner(System.in).nextLine();
        TipoPessoa tipoPessoaEscolhido = TipoPessoa.valueOf(tipoEscolhido);

        // Enum deve ser comparado com ==
        if (tipoPessoaEscolhido == TipoPessoa.FISICA) {
            System.out.println("É pessoa física!");
        } else {
            System.out.println("É jurídica!");
        }

    }
}
