package m15excecoes;

public class ExemplosDeUsoOuNaoExcecoes {

    public static void main(String[] args) {

        int[] lista = new int[]{0,1,2};

        /*
        Prefira if sempre que possível em vez de try/catch
         */
        if(lista.length > 3){
            System.out.println(lista[3]);
        }else {
            System.out.println("Posição inexistente!");
        }

        try {
            System.out.println(lista[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inexistente!");
        }

    }
}
