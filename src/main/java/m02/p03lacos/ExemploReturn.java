package m02.p03lacos;

public class ExemploReturn {

    public static void main(String[] args){
        int resultado = calcula();
        System.out.printf("Fim do programa! Resultado: %d", resultado);
    }

    public static int calcula(){
        int contador = 1;
        while (true){
            int multi = contador*7;

            if(contador == 10){
                System.out.println("Chegou a 10, saíndo (do método)...");
                return multi;
            }

            System.out.printf("7 x %d = %d\n", contador, multi);
            contador = contador+1;
        }
    }
}
