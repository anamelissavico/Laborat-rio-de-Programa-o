public class Circulo {
    double raio;

    double area(){
        double resultadoArea= (raio*raio)*Math.PI;
        return resultadoArea;
    }

    double perimetro(){
        double resultafoPerimetro= (2*Math.PI)*raio;
        return resultafoPerimetro;
    }
}

