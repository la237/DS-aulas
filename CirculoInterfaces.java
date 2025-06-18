class CirculoInterfaces implements FormaInterface {
    private double raio;

    public CirculoInterfaces(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }
}
