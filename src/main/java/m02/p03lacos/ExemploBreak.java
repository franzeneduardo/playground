package m02.p03lacos;

public class ExemploBreak {

    public static void main(String[] args){
        calcula();
        System.out.printf("Fim do programa!");
    }

    public static void calcula(){
        int contador = 1;

        while (contador < 50){
            int multi = contador*7;

            if(contador == 10){
                System.out.println("Chegou a 10, saíndo (do método)...");
                break;
            }

            System.out.printf("7 x %d = %d\n", contador, multi);
            contador = contador+1;
        }

        System.out.println("Terminou o FOR");
    }
}
