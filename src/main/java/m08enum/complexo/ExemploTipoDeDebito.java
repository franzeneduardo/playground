package m08enum.complexo;

import java.util.Scanner;

public class ExemploTipoDeDebito {

    public static void main(String[] args) {

//        TipoDeDebito tipo = TipoDeDebito.CREDITO;
//
//        System.out.println(tipo.name());
//        System.out.println(tipo.ordinal());
//        System.out.println(tipo.getSigla());
//        System.out.println(tipo.getOrdem());
//        System.out.println(tipo.getTaxa());

        System.out.println("Informe a sigla do tipo de débito:");
        char tipoInformado = new Scanner(System.in).nextLine().charAt(0);

        TipoDeDebito[] tipos = TipoDeDebito.values();

        for (int i = 0; i < tipos.length; i++) {

            if(tipos[i].getSigla() == tipoInformado){
                TipoDeDebito tipo = tipos[i];
                System.out.println(tipo.name());
                System.out.println(tipo.ordinal());
                System.out.println(tipo.getSigla());
                System.out.println(tipo.getOrdem());
                System.out.println(tipo.getTaxa());
                break;
            }

        }

    }
}
