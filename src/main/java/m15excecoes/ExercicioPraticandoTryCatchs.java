package m15excecoes;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLDataException;

//1 - Trate as exceções a seguir:
//TODO corrigir
public class ExercicioPraticandoTryCatchs {

    //Não altere esse método, somente dentro dos métodos internos
    public static void main(String args[]) {
        erroDeConversao();
        arquivoInexistente();
        indexOfBounds();
        nullPointerException();
        excecoesNumericas();
        argumentoObrigatorio();
        multiplasExcecoes();
    }

    private static void erroDeConversao() {

        System.out.println("Inicio");

        int num = 0;
        try {
            num = Integer.parseInt("zero");
        }catch (NumberFormatException e){
            System.out.println("Ocorreu uma falha na operação aritmética: "+e.getMessage());
        }

        System.out.println("FIM");
    }

    private static void arquivoInexistente() {

        //Estou apenas "definindo" qual arquivo vou abrir
        File file = new File("E://arquivo.txt");

        //Try-with-resources que chama o .close() que pode disparar o IOException!
        // ... e o new FileReader(file) pode disparar FileNotFoundException

        //try-with-resources
        try (FileReader fr = new FileReader(file)){
            System.out.println(fr.read());

        }catch (IOException e){
            System.out.println("Arquivo não pode ser aberto!");
        }
    }

    private static void indexOfBounds() {
        String e = "Imersao Java";

        if(e.length() > 29){
            char f = e.charAt(29);
            System.out.println(f);
        }

        System.out.println(e);
    }

    private static void nullPointerException() {
        String d = null;
        if(d != null){
            System.out.println(d.charAt(0));
        }
    }

    private static void excecoesNumericas() {
        int a = 30, b = 0;
        try{
            int c = a / b;
            System.out.println ("Resultado = " + c);
        }catch (ArithmeticException e){
            System.err.println("Erro ao realizar o cálculo: "+e.getMessage());
        }
    }

    private static void argumentoObrigatorio(){
        try {
            metodoDisparaIllegal(null);
        }catch (IllegalArgumentException e){
            System.out.println("Ocorreu um erro: "+e.getMessage());
        }
    }

    private static void multiplasExcecoes() {
        try {
            metodoDisparaSql();
            metodoDisparaIOException();

        }catch (SQLDataException e) {
            System.out.println("Ocorreu um erro SQL");
        }catch (IOException e){
            System.out.println("Ocorreu um erro de E/S");
        }catch (Exception e){
            System.out.println("Ocorreu um erro genérico!");
        }
    }

    private static void multiplasExcecoesMultiCatch() {
        //trate com apenas um multi-catch
        try {
            metodoDisparaSql();
            metodoDisparaIOException();
        }catch (SQLDataException | IOException e){
            System.out.println("Ocorreu um erro de SQL/IO");
        }
    }

    //Não altere esse método, somente quem o chama
    private static void metodoDisparaIllegal(String param) {
        if(param == null){
            throw new IllegalArgumentException("Parâmetro não deveria ser nulo");
        }
        System.out.println(param);
    }

    //Não altere esse método, somente quem o chama
    private static void metodoDisparaIOException() throws IOException {
        throw new IOException();
    }

    //Não altere esse método, somente quem o chama
    private static void metodoDisparaSql() throws SQLDataException {
        throw new SQLDataException();
    }
}