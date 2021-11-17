package m10interfaces;

public interface RegraNegocio {

    //Método de interfaces só podem ser PUBLIC (omitir sempre)
    boolean validaNumero(String numero);

    //boolean validaNome(String nome);

    //Métodos default vieram com o JAVA 8
    default boolean validaNome(String nome) {
        return nome != null && nome.length() > 3;
    }

    //boolean validaSituacao(String situacao);

}
