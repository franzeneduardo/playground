package m05Strings;

public class ExemplosStrings {

    public static void main(String[] args) {

        String estado = "Rio Grande do Sul";
        exemplos();

    }

    private static void imprimeAlgo() {
        String estado = "Rio Grande do Sul";
    }

    private static void exemplos() {

        //Split: Exemplo de uma palavra por linha.
        //Entrada: "Teste de strings"
        String stringTeste = "Teste de strings contendo,virgula";
        String[] partes = stringTeste.split(" ");//https://regexr.com/

        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);
        }
        String[] partes2 = "Teste de String".split(" ");


        //Substring: Imprimir os primeiros 13 dígitos da String.
        //Entrada: "Cão que ladra não morde".
        //Saída: Cão que ladra
        String caoQueLadra = "Cão que ladra não morde".substring(0, 13);
        System.out.println(caoQueLadra);

        //toLowerCase: Transforme a primeira palavra em Maiúsculas e as demais em minúsculas.
        //Entrada: "Pimenta nos Olhos dos Outros é Refresco"
        //PIMENTA nos olhos dos outros é refresco
        System.out.println(
                "Pimenta nos Olhos dos Outros é Refresco" // criando no Pool, pois está entre aspas
                .toLowerCase() //criando uma nova, pois é imutável na heap
                .toUpperCase() //criando uma nova (de novo)
                .toLowerCase()); //criando uma nova (de novo)
        ;

        //toUpperCase: Transforme a última palavra em Minúsculas e as demais em minúsculas.
        //Entrada: "UM DIA É DA CAÇA, OUTRO DO CAÇADOR".
        //Entrada: "UM DIA É DA CAÇA, OUTRO DO caçador".
        System.out.println("UM DIA É DA CAÇA, OUTRO DO caçador".toUpperCase());

        //TIM - Remove espaços do início ou final da String.
        String senha = " passw 0rd ";
        System.out.println(senha.trim());

        String pass = " \n \t              ";
        if(pass.isEmpty()){ //pass.length() == 0
            System.out.println("Senha vazia = leght = 0");
        }
        if(pass.isBlank()){// semelhante a pass.trim().length() == 0
            System.out.println("Senha blank = lenght =0 ou somente espaços em branco/enter/tab...");
        }

        String fraseSemCao = "Cão que ladra não morde outro cão"
                .replaceAll("[Cc]ão", "")
                .trim();
        String stringFormatada = String.format("Frase sem o cão: %s", fraseSemCao);
        System.out.println(stringFormatada);

        //peguei o char da primeira posição
        char primeiraLetra = stringFormatada.charAt(0);
        System.out.printf("Primeira letra: %s", primeiraLetra);

        String meuNumero1 = String.valueOf(1);
        System.out.printf("Numero: %s", meuNumero1);

        System.out.println("Olá turma");

        //Concatenar, juntar Strings

        String nome1 = "Meu nome é ".concat("Gilberto");
        String nome2 = "Meu nome é " + "Gilberto";
        String nome3 = String.format("Meu nome é %s", "Gilberto");

    }
}
