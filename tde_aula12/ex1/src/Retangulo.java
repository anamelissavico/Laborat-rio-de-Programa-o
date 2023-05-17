public class Retangulo extends FiguraGeometrica{
    double base;
    double altura;

    @Override
    double calcularArea() {
        double area= base*altura;
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro= (base*2) + (altura * 2);
        return perimetro;
    }
}
