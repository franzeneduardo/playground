package m14heranca;

public class Pessoa {

    public Pessoa() {
        System.out.println("Inicializada classe pessoa");
    }

    private int id;

    public void setId(int id){
        if(id == 0){
            System.out.println("ID não pode ser 0");
        }
        this.id = id;
    }
}
