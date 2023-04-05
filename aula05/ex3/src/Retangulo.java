public class Retangulo {
    double base;
    double altura;

    double area(){
        double resultadoArea=base*altura;
        return resultadoArea;
    }

    double perimetro(){
        double resultadoPerimetro= base+base+altura+altura;
        return resultadoPerimetro;

    }
}
