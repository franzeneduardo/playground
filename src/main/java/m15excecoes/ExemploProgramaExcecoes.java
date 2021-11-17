package m15excecoes;

import m15excecoes.exceptions.UsuarioIncorretoException;

public class ExemploProgramaExcecoes {
    public static void main(String[] args) {
        try {
            excecoesUnchecked();
        }catch (Exception e){
            System.out.println("Deu ruim no excecoesUnchecked:" + e.getMessage());
        }
        try {
            excecoesChecked();
        }catch (Exception e){
            System.out.println("Deu ruim no excecoesChecked:" + e.getMessage());
        }
        try {
            excecoesCustomizada();
        }catch (Exception e){
            System.out.println("Deu ruim no excecoesCustomizada:" + e.getMessage());
        }
    }

    private static void excecoesUnchecked() {
        throw new RuntimeException("Erro X");//Disparei silenciosamente
    }

    private static void excecoesChecked() throws Exception {
        throw new Exception(" Erro Y"); // Disparei mas precisou do throws
    }

    private static void excecoesCustomizada(){
        throw new UsuarioIncorretoException("Erro Z");
    }
}
