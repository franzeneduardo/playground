package m10interfaces;

public class Programa {

    public static void main(String[] args) {

        String numero = "112321341411";

        RegraNegocio regraNegocio;

        if(numero.length() == 11){
            regraNegocio = new RegraNegocioPessoaFisica();
        }else{
            regraNegocio = new RegraNegocioPessoaJuridica();
        }

        boolean resultado = executaValidacao(regraNegocio, numero);
        System.out.println("Resultado: "+resultado);
    }

    private static boolean executaValidacao(RegraNegocio regraNegocio, String numero) {

       return regraNegocio.validaNumero(numero);

    }
}
