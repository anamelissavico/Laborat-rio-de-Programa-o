public class Main {
    public static void main(String[] args) {
        FiguraGeometrica figura1= new FiguraGeometrica();

       Quadrado quadrado1 = new Quadrado();
       quadrado1.lado=10;

       quadrado1.calcularArea();;
       quadrado1.calcularPerimetro();

    }
}