public class Triangulo extends FiguraGeometrica{

    //Vamos combinar que vai ser um triangulo equilátero
    double base;
    double altura;

    @Override
    double calcularArea() {
        double area= (base*altura)/2;
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro=base*3;
        return perimetro;
    }
}
