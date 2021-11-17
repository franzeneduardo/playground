package m10interfaces;

// se fosse abstract não poderia ser instanciada,
// mas não precisa cumprir to do o contrato
public class RegraNegocioPessoaFisica implements RegraNegocio{

    public RegraNegocioPessoaFisica() {
        System.out.println("É pessoa FÍSICA");
    }

    @Override
    public boolean validaNumero(String numero){
        if(validaNumeroCPF(numero)){
            return true;
        }
        return false;
    }

    @Override
    public boolean validaNome(String nome) {
        return nome != null && nome.length() > 2;
    }

    private boolean validaNumeroCPF(String numero) {
        return numero.length() == 11;
    }

}
