public class CachorroAbstracao extends AnimalAbstracao{
    public CachorroAbstracao(String nome){
        super(nome); /*chama o construtor da superclasse paea inicializar o atributo*/
    }

    //Sobrescrevendo o método emitirSom da superclasse
    @Override
    public void emitirSom(){
        System.out.println("Au au");
    }
}
