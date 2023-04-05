import java.util.Scanner;

public class Livro {
    String titulo;
    String autor;
    String editora;
    double paginas;

    void exibirDetalhes(Livro livro){
        System.out.println("O titulo do livro é:"+ livro.titulo);
        System.out.println("O autor do livro é:"+ livro.autor);
        System.out.println("O editora do livro é:"+ livro.editora);
        System.out.println("O número das páginas do livro é:"+ livro.paginas);
    }
}
