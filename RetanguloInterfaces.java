 class RetanguloInterfaces  implements FormaInterface{
    private double largura;
    private double altura;

    public RetanguloInterfaces(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return largura * altura;
    }
}
