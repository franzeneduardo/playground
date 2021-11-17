package m02.p02ifs;

import java.util.Scanner;

/*
- Ler número, esse número é uma voltagem.
    Se igual a 110 ou 220, escrever a voltagem.
    Se diferente escrever "Voltagem inválida".

- Ler número. Esse número é uma temperatura.
    Se menor que 15, escrever "Está frio"
    Se entre 15 e 25, escrever "Clima ameno" (inclusivo)
    Se maior que 25, escrever "Está quente"
    
- Ler número. Esse número é a nota de uma prova.
    Se menor que 0 ou maior que 100 escrever "Erro"
    Se <= 60: escrever "Reprovado"
    Se > 60 e < 70: escrever "Reforço"
    Se >= 70 escrever "Aprovado"
 */
public class ExercicioIfElse {
    public static void main(String[] args) {

        while (true) {
            menu();
        }
    }

    private static void menu(){
        System.out.println("Escolha uma opção: 1 - Temperatura, 2 - Voltagem, 3 - Nota, 4 - Sair");
        int menu = new Scanner(System.in).nextInt();

        switch (menu) {
            case 1:
                verificaTemperatura();
                break;
            case 2:
                verificaVoltagem();
                break;
            case 3:
                calculaNota();
                break;
            case 4:
                System.out.println("Até logo :)");
                System.exit(0); // Dá uma ordem pro SO desligar a JVM - 0 (sucesso) 1 - erro
                //Não precisa de break pois o Exit encerra a JVM...
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void verificaTemperatura() {

        System.out.println("Escreva uma temperatura: ");
        float temperatura = new Scanner(System.in).nextFloat();

        if (temperatura < 15) {
            System.out.println("Está frio");

        } else if (temperatura <= 25) { //temperatura >= 15 && temperatura < 25
            System.out.println("Clima ameno");
        } else {
            System.out.println("Está quente");
        }
    }

    private static void calculaNota() {
        System.out.println("Escreva uma Nota: ");
        float notaProva = new Scanner(System.in).nextFloat();

        if (notaProva < 0 || notaProva > 100) {
            System.out.println("Erro");

        } else if (notaProva <= 60) {
            System.out.println("Reprovado");
        } else if (notaProva < 70) {
            System.out.println("Reforço");
        } else {
            System.out.println("Aprovado");
        }
    }

    private static void verificaVoltagem() {
        System.out.println("Escreva uma voltagem (110/220): ");

        int voltagem = new Scanner(System.in).nextInt();

        if (voltagem == 110 || voltagem == 220) { // || (OU) && (AND)
            System.out.printf("Voltagem selecionada: %s\n", voltagem);

        } else {
            System.out.println("Voltagem inválida! ");
        }
    }

}
