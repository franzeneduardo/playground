package m14heranca;

public class PessoaJuridica extends Pessoa {

    public PessoaJuridica() {
        super();// invoca o construtor da classe "herdada"

        System.out.println("Inicializada classe Pessoa Juridica");
    }

    private String cnpj;

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj; //this é da própria classe
        super.setId(1); // é da classe pai
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
