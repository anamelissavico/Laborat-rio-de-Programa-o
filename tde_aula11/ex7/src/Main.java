public class Main {
    public static void main(String[] args) {
    Produto produto1 = new Produto();
    produto1.codigo=31335;
    produto1.preco=27.50;

    Produto produto2 = new Produto();
    produto2.codigo=33545;
    produto2.preco=14.75;

    System.out.println("Lista de produtos:");
    produto1.exibirLista();
    produto2.exibirLista();

    ProdutoPerecivel mortadela = new ProdutoPerecivel();
    mortadela.codigo=25765;
    mortadela.preco=24.3;
    mortadela.dataValidade="15-05-2023";

    ProdutoPerecivel laranja = new ProdutoPerecivel();
    laranja.codigo=21547;
    laranja.preco=7.50;
    laranja.dataValidade="10-05-2023";

    System.out.println("Lista de produtos perecíveis:");
    mortadela.exibirLista();
    laranja.exibirLista();
    }
}