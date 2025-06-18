public class GatoAbstracao extends AnimalAbstracao {
        public GatoAbstracao(String nome){
            super(nome); /*chama o construtor da
            superclasse para inicializar o atributo nome*/
        }

        //Sobreescrevendo o método emitir som da superclasse
        @Override
        public void emitirSom(){
            System.out.println("Miau!");
        }
}
