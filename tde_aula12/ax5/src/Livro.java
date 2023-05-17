public class Livro extends Produto{
    @Override
    void calcularPreco() {
        System.out.println("O preço do livro é 250 reias.");
    }

    @Override
    void exibirDetalhes() {
        System.out.println("Detalhes do livro:");
    }
}
