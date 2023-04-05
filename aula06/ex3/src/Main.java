import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Animal animal1= new Animal();
        animal1.nome="vaca";

        System.out.println(animal1.nome);
        animal1.dormir();
        animal1.emitirSom();
    }
}