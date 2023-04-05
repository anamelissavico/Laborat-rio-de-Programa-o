import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Fracao fracao1= new Fracao();

        Scanner input= new Scanner(System.in);
        System.out.println("Digite o numerador da primeira fração:");
        int numerador1 = input.nextInt();
        fracao1.numerador= numerador1;

        Scanner input2= new Scanner(System.in);
        System.out.println("Digite o denominador da primeira fração:");
        int denominador1 = input2.nextInt();
        fracao1.denominador=denominador1;

        Fracao fracao2= new Fracao();

        Scanner input3= new Scanner(System.in);
        System.out.println("Digite o numerador da segunda fração:");
        int numerador2 = input3.nextInt();
        fracao2.numerador=numerador2;

        Scanner input4= new Scanner(System.in);
        System.out.println("Digite o denominador da segunda fração:");
        int denominador2= input4.nextInt();
        fracao2.denominador=denominador2;

        Fracao fracao3 = new Fracao();
        fracao3= fracao1.multiplica_funcao(fracao2);
        System.out.println("O resultado da multiplicação das frações apresentadas é: "+ fracao3.numerador + "/" + fracao3.denominador);
    }


}
