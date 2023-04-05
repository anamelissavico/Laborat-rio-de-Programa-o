
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Circulo circulo1= new Circulo();

        Scanner raio= new Scanner(System.in);
        System.out.println("Digite o raio da circunferência:");
        circulo1.raio=raio.nextDouble();

        System.out.println("A área da circunferência de raio "+ circulo1.raio+ " é: " + circulo1.area());
        System.out.println("A perímetro da circunferência de raio "+ circulo1.raio+ " é: " + circulo1.perimetro());
    }
}