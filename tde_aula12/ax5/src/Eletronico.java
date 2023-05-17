public class Eletronico extends Produto{
    @Override
    void calcularPreco() {
        System.out.println("O preço do eletrônico é 600 reias.");
    }

    @Override
    void exibirDetalhes() {
        System.out.println("Detalhes do eletronico:");
    }
}
