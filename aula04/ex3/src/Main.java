import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("De qual destas figuras geométricas você deseja saber a área: [1] quadrado [2] triângulo [3] circunferência [4] trapézio:");
        int entrada1 = entrada.nextInt();

        if (entrada1>=1 && entrada1<=4) {
            if (entrada1 == 1) {

                quadrado quadrado1 = new quadrado();
                Scanner input = new Scanner(System.in);
                System.out.println("Digite o lado do seu quadrado:");
                double lado = input.nextInt();
                quadrado1.lado = lado;

                System.out.println("a área do quadrado com os lados = " + quadrado1.lado + ", é " + quadrado1.calcularArea());
            }
            if (entrada1 == 2) {

                triangulo triangulo1 = new triangulo();
                Scanner input2 = new Scanner(System.in);
                System.out.println("Digite a base do seu triângulo:");
                triangulo1.base = input2.nextInt();
                Scanner input3 = new Scanner(System.in);
                System.out.println("Digite a altura do seu triângulo:");
                triangulo1.altura = input3.nextInt();

                System.out.println("A área do triângulo de base " + triangulo1.base + "e altura " + triangulo1.altura + " é " + triangulo1.calcularArea());
            }

            if (entrada1 == 3) {

                circunferencia circunferencia1 = new circunferencia();
                Scanner input4 = new Scanner(System.in);
                System.out.println("Digite o raio da sua circunferência:");
                circunferencia1.raio = input4.nextInt();

                System.out.println("A área da circunferência de raio " + circunferencia1.raio + " é " + circunferencia1.calcularArea());
            }

            if (entrada1 == 4) {

                trapezio trapezio1 = new trapezio();

                Scanner input5 = new Scanner(System.in);
                System.out.println("Digite a base maior do seu trapézio:");
                trapezio1.baseMaior = input5.nextInt();
                Scanner input6 = new Scanner(System.in);
                System.out.println("Digite a base menor do seu trapézio:");
                trapezio1.baseMenor = input6.nextInt();
                Scanner input7 = new Scanner(System.in);
                System.out.println("Digite a altura do seu trapézio:");
                trapezio1.altura = input7.nextInt();

                System.out.println("A área do trapézio de base maior " + trapezio1.baseMaior + ", de base menor " + trapezio1.baseMenor + " e altura " + trapezio1.altura + " é " + trapezio1.calcularArea());
            }
        }
        else {
            System.out.println("Número inválido!");
        }

    }
}