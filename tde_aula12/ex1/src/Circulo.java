public class Circulo extends FiguraGeometrica {
    double raio;

     double calcularArea(){
        double area= Math.PI * (raio*raio);
        return area;
    }

    double calcularPerimetro(){
         double perimetro= (2* Math.PI)*raio;
         return perimetro;
    }

}
