package m14heranca;

public class Programa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setId(1);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setId(1);
        pessoaJuridica.setCnpj("1");

        Pessoa pessoa2 = new PessoaJuridica();
        informaId(pessoa2);
//        pessoa2.setCnpj não aparece

    }

    private static void informaId(Pessoa pessoa2) {
        pessoa2.setId(3);
    }
}
