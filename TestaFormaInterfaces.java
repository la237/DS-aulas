public class TestaFormaInterfaces {
    public static void main(String[] args){
        FormaInterface circulo = new CirculoInterfaces(2);
        FormaInterface retangulo = new RetanguloInterfaces(3,4);
        System.out.println("Área do circulo: " + circulo.calcularArea());
        System.out.println("Área do retangulo: "+ retangulo.calcularArea());
    }
}
