package m15excecoes.exceptions;

public class UsuarioIncorretoException extends RuntimeException {

    public UsuarioIncorretoException(String mensagem){
        super(mensagem);
    }
}

//        RuntimeException // Silenciosa
//        Exception // precisa do throws
