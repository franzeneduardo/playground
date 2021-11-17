package m17optional;

import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {
        Optional<String> nome = obtemNome();

        //Exemplo 1
//        if (nome.isPresent()) {
//            System.out.println(nome.get());
//        }else {
//            System.out.println("Nome vazio");
//        }

        //Exemplo 2
//        nome
//            .filter(n -> n.startsWith("G"))
//            .map(n -> n.toUpperCase())
//            //.ifPresent(n -> System.out.println(n));
//            .ifPresentOrElse(
//                n -> System.out.println(n),
//                () -> System.out.println("Nenhum elemento encontrado"));

        //Exemplo 3 - OR

        String nomeComOrRetornandoNull = nome.orElse(null);

        String nomeComOr = nome.orElse("Fulano");
        System.out.println(nomeComOr);

        String nomeComOrDoBanco = nome.orElseGet(() -> obtemDefaultDoBanco());
        System.out.println(nomeComOrDoBanco);

        String nomeComOrObrigatorioCustomizado = nome
                .orElseThrow(() -> new RuntimeException("Não há gato na caixa"));
        System.out.println(nomeComOrObrigatorioCustomizado);

        String nomeComOrObrigatorio = nome.orElseThrow();
        System.out.println(nomeComOrObrigatorio);
    }

    /*
    Método CUSTOSO! Pois tem que ir lá no Banco Buscar.
     */
    private static String obtemDefaultDoBanco() {
        return "Nome do Banco!";
    }

    public static Optional<String> obtemNome(){
        String nome = getNome();
        if(nome != null){
            //faz algo....
            return Optional.of(nome);
        }else{
            return Optional.empty();
        }
    }

    private static String getNome() {
//        return "Gilberto";
        return null;
    }

//
//    static Optional<String> obtemNome(){
//        String nome = new Scanner().nextLine();
//        return Optional.ofNulable(nome);
//    }
}
