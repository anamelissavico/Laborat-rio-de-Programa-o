import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Livro livro1= new Livro();

        Scanner titulo= new Scanner(System.in) ;
        System.out.println("Digite o titulo do seu livro:");
        livro1.titulo=titulo.next();

        Scanner autor= new Scanner(System.in);
        System.out.println("Digite o autor do seu livro:");
        livro1.autor=autor.next();

        Scanner editora= new Scanner(System.in);
        System.out.println("Digite a editora do seu livro:");
        livro1.editora=editora.next();

        Scanner paginas= new Scanner(System.in);
        System.out.println("Digite o número de páginas do seu livro:");
        livro1.paginas= paginas.nextDouble();

        livro1.exibirDetalhes(livro1);
    }
}