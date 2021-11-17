package m08enum.simples;

import java.util.Scanner;

/*
Exercício 1:

1. Crie um enum TipoCartao com as modalidades:
- STANDARD
- GOLD
- PREMIUM
- BLACK

1. Crie um método que Listar os tipos de cartões disponíveis e
    solicitar ao usuário para informar um tipo de cartão
    e a partir do informado, identificar se é um tipo de cartão válido.

2. Crie um novo método que solicita a rendaMensal
e devolve o tipo de cartão de uma financeira
de acordo com a rendaMensal:

STANDARD:   rendaMensal < 1000
GOLD:       rendaMensal >= 1000 e < 3000
PREMIUM:    rendaMensal >= 3000 e < 10000
BLACK:      rendaMensal >= 10000
 */
public class ExercicioEnumTipoCartao {

    public static void main(String[] args) {
        identificaCartaoPeloNome();
        //identificaCartaoPelaRenda();

        System.out.println("Informe o valor da renda:");
        int renda = new Scanner(System.in).nextInt();
        TipoCartao tipoCartaoObtido = calculaCartaoPelaRenda(renda);
        System.out.print("A renda informada permite um cartão do tipo: ");
        System.out.println(tipoCartaoObtido.name());
    }

    public static TipoCartao calculaCartaoPelaRenda(int renda) {
        if (renda < 1000) {
            return TipoCartao.STANDARD;
        } else if (renda < 3000) {
            return TipoCartao.GOLD;
        } else if (renda < 10000) {
            return TipoCartao.PREMIUM;
        } else {
            return TipoCartao.BLACK;
        }
    }

    public static void identificaCartaoPelaRenda() {

        System.out.println("Informe o valor da renda:");
        int renda = new Scanner(System.in).nextInt();

        System.out.print("A renda informada permite um cartão do tipo: ");
        if (renda < 1000) {
            System.out.println(TipoCartao.STANDARD.name());

        } else if (renda < 3000) {
            System.out.println(TipoCartao.GOLD.name());

        } else if (renda < 10000) {
            System.out.println(TipoCartao.PREMIUM.name());

        } else {
            System.out.println(TipoCartao.BLACK.name());
        }
    }

    public static void identificaCartaoPeloNome() {

        TipoCartao[] tipos = TipoCartao.values();

        System.out.println("Tipos disponíveis: ");
        for (int i = 0; i < tipos.length; i++) {
            System.out.printf("Tipo: %s\n", tipos[i].name());
        }

        System.out.println("Escolha um dos tipos: ");
        String tipoEscolhido = new Scanner(System.in).nextLine();
        //Valida e lança um exceção se não encontrar o tipo no enum
        TipoCartao tipo = TipoCartao.valueOf(tipoEscolhido.toUpperCase());
        System.out.printf("Tipo escolhido: %s\n", tipo);
    }
}
