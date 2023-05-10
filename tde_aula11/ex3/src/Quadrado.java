public class Quadrado extends FiguraGeometrica {
    double lado;

    void calcularArea(){
        System.out.println("A área do quadrado é: "+ lado*lado);

    }

    void calcularPerimetro(){
        System.out.println("O perimêtro do quarado é: "+ lado*4);
    }
}
