package m08enum.complexo;
// a palavra package não é usada para a visibilidade
// mas sim para dizer o pacote que está



//public: public enum TipoDeDebito {
//package: enum TipoDeDebito {

enum TipoDeDebito {
    SAQUE('S', 1, 0F),
    CREDITO('C', 2, 8.5F),
    DEBITO('D', 3, 1F);

    //Deixo os atributos privados
    // e exponho através de métodos
    private char siglaArmazenada;
    private int ordemArmazenada;
    private float taxaArmazenada;

    TipoDeDebito(char sigla, int ordem, float taxa){
        siglaArmazenada = sigla;
        ordemArmazenada = ordem;
        taxaArmazenada = taxa;
    }

/*
    //Pode ter um segundo construtor...
    TipoDeDebito(char sigla){
        siglaArmazenada = sigla;
    }
*/

    public char getSigla(){
        return siglaArmazenada;
    }

    public int getOrdem(){
        return ordemArmazenada;
    }

    public float getTaxa(){
        return taxaArmazenada;
    }
}
