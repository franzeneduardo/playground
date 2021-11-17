package m01;

public class InformacoesPc {

    public static void main(String[] args) {

// %f - número decimal - ponto Flutuante
// %d - número inteiro
        System.out.printf("Memória Máxima: %d MB \n",
                Runtime.getRuntime().maxMemory() / 1024 / 1024);

        System.out.printf("Memória Total: %d MB\n",
                Runtime.getRuntime().totalMemory() / 1024 / 1024);

        System.out.printf("Memória Free: %d MB\n",
                Runtime.getRuntime().freeMemory() / 1024 / 1024);

        System.out.printf("Processadores: %d\n",
                Runtime.getRuntime().availableProcessors());

    }
}
