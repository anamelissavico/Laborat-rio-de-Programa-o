import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Calculadora calculadora= new Calculadora();
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        calculadora.numero1=numero1.nextInt();
        Scanner numero2= new Scanner(System.in);
        System.out.println("Digite o segundo número:");
        calculadora.numero2= numero2.nextInt();

        System.out.println("A soma de "+ calculadora.numero1 + " + " + calculadora.numero2 + " é: " + calculadora.somar());
        System.out.println("A divisão de "+ calculadora.numero1 + " / " + calculadora.numero2 + " é: " + calculadora.dividir());
        System.out.println("A subtração de "+ calculadora.numero1 + " - " + calculadora.numero2 + " é: " + calculadora.restar());
        System.out.println("A multiplicação de "+ calculadora.numero1 + " x " + calculadora.numero2 + " é: " + calculadora.multiplicar());


    }
}