package m05Strings;

public class ExemplosComparacaoTiposPorReferencia {

    public static void main(String[] args) {

        String nome1 = "Gilberto".toUpperCase(); //Heap endereço Y
        String nome2 = "GILBERTO"; //Poll endereço X
        String nome3 = "GILBERTO"; //Poll endereço X

        if(nome1 == nome2){
            System.out.println("nome1 == nome2");
        }

        if(nome2 == nome3){
            System.out.println("nome2 == nome3");
        }

        if(nome2.equals(nome3)){ //compara o conteúdo
            System.out.println("nome2.equals(nome3)");
        }

        if(nome2.equalsIgnoreCase("GiLBeRto")){ //compara o conteúdo
            System.out.println("nome2.equalsIgnoreCase(\"GiLBeRto\")");
        }

        //compareTo: compara o conteúdo
        /*
            negativo = diferente, anterior alfabeticamente
            0 - igual
            positivo  = diferente, posterior alfabeticamente
         */
        if(nome2.compareTo(nome3) == 0){
            System.out.println("nome2.equals(nome3)");
        }

        String nome4 = null; // null - ausência de referência em memória, não foi instanciado

        // if(!nome4.equals(null)){ ERRADO!! Vai dar NPE
        if(nome4 != null){ //Para evitar NPE - NullPointerException, sempre com == ou !=
            System.out.println(nome4.length());
        }

    }
}
