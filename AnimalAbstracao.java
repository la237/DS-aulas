import java.sql.SQLOutput;

abstract class AnimalAbstracao {
    private  String nome;

    public AnimalAbstracao(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    //metodo de abstrato(sem implementação)
    public abstract  void emitirSom();
}


