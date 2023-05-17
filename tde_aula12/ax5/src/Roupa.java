public class Roupa extends Produto{

    @Override
    void calcularPreco() {
        System.out.println("O preço da roupa é 350 reias.");
    }

    @Override
    void exibirDetalhes() {
        System.out.println("Detalhes da roupa:");
    }
}
