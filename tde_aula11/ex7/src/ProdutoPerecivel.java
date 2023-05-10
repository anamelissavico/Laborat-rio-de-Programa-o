public class ProdutoPerecivel extends Produto {
    String dataValidade;

    void exibirLista(){
        System.out.println("Código do produto: "+ codigo);
        System.out.println("Preço do produto: "+ preco);
        System.out.println("Data de validade: " + dataValidade);
        System.out.println("----------------------------------------------------------------------");
    }

}
