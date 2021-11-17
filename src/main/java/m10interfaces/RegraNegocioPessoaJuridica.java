package m10interfaces;

public class RegraNegocioPessoaJuridica implements RegraNegocio{

    public RegraNegocioPessoaJuridica() {
        System.out.println("É pessoa JURIDICA");
    }

    @Override
    public boolean validaNumero(String numero){
        if(numero.length() == 14){
            return true;
        }
        return false;
    }

}
