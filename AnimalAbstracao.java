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

public class CachorroAbstracao extends  AnimalAbstracao{
    public CachorroAbstracao(String nome){
        super(nome); //chama o construtor da superclasse  para inicializar o atributo nome
    }
    //Sobrescrevendo o metodo emitirSom da super classe
    @Override
    public void emitirSom(){
        System.out.println("AU AU");
    }
}
