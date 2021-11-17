package m08enum.complexo;

enum ImpostoMedioProduto {

    PAO_FRANCES("Pão Francês",	16.86f),
    ARROZ("Arroz",	    17.24f),
    FEIJAO("Feijão",	    17.24f),
    FERMENTO("Fermento", 38.48f),
    PIZZA("Pizza",	    36.54f),
    MANTEIGA("Manteiga", 33.77f),
    CERVEJA("Cerveja",  42.69f),
    VINHO("Vinho", 	    69.73f);

    private String produto;
    private float taxa;

    ImpostoMedioProduto(String produtoConfigurado, float taxaConfigurada){
        produto = produtoConfigurado;
        taxa = taxaConfigurada;
    }

    public String getProduto() {
        return produto;
    }

    public float getTaxa() {
        return taxa;
    }
}
