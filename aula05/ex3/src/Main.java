import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Retangulo rentangulo1 = new Retangulo();

        Scanner base= new Scanner(System.in);
        System.out.println("Digite a base do retangulo:");
        rentangulo1.base=base.nextInt();
        Scanner altura= new Scanner(System.in);
        System.out.println("Digite a altura do retangulo:");
        rentangulo1.altura=altura.nextInt();

        System.out.println("A área do retângulo de base "+ rentangulo1.base+" e altura "+ rentangulo1.altura+ " é: "+ rentangulo1.area());
        System.out.println("A perímetro do retângulo de base "+ rentangulo1.base+" e altura "+ rentangulo1.altura+ " é: "+ rentangulo1.perimetro());
    }
}