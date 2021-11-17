package m17optional;

import java.util.Optional;

public class ExemploCache {

    public static void formaComOptional() {

//        String informacao = Optional
//                .ofNullable(variavelAmbiente())
//                .or(() -> Optional.ofNullable(cacheLocal()))
//                .or(() -> Optional.ofNullable(bancoDeDados()))
//                .orElse("A");

//        String informacao = variavelAmbiente()
//                .or(() -> cacheLocal())
//                .or(() -> bancoDeDados())
//                .orElse("A");

        String informacao = variavelAmbiente()
                .or(ExemploCache::cacheLocal)
                .or(ExemploCache::bancoDeDados)
                .orElse("A");

        System.out.println(informacao);
    }


   /* public static void formaSemOptional() {

        String informacao = variavelAmbiente();
        if(informacao == null){
            informacao = cacheLocal();
            if( informacao == null){
                informacao = bancoDeDados();
            }
        }

        if(informacao == null){
            informacao = "A";
        }

        System.out.println(informacao);
    }*/

    public static Optional<String> variavelAmbiente(){
        return Optional.empty();
    }

    public static Optional<String> cacheLocal(){
        return Optional.empty();
    }

    public static Optional<String> bancoDeDados(){
        return Optional.empty();
    }

}
