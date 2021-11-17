package m02.p01tipos;

import java.math.BigDecimal;

/*
Desafio: TiposPrimitivos II - Crie variáveis que representem:

- a quantidade de vendas de um dia de uma pequena empresa (1023)
- a situação de um boleto (pago/não pago)
- o tipo de pagamento (Crédito, Débito)
- um CNPJ
- o valor de um produto, considerando itens de uma farmácia
- o código de barras de um Produto
*/
public class ExercicioDesafioPrimitivos {

    public static void main(String[] args) {
        //- a quantidade de vendas de um dia de uma pequena empresa (1023)
        int quantidadeVendas = 1024;

        //- a situação de um boleto (pago/não pago)
        boolean boletoPago = true;

        //Evitem :) Veremos enum na sequencia
        char situacaoBoleto = 'P'; //pago (p), pendente (e), protestado (r), vencido (v)
        int outraSituacaoBoleto = 0; //pago (0), pendente (1), protestado (2), vencido (3)

        //- o tipo de pagamento (Crédito, Débito)
        char tipoPagamento = 'C'; //C/D

        //- um CNPJ
        String cnpj = "09998887776611";

        //- o valor de um produto, considerando itens de uma farmácia
        // Usem double se for um valor MUITO alto
        // Porém tipo mais apropriado no Java para valores é o BigDecimal!
        float valorProduto = 1750F;

        //- o código de barras de um Produto
        String codigoBarras = "9870101010101";

    }
}