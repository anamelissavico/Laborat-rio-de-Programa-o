public class Main {
    public static void main(String[] args) {
        Produto produto1= new Produto();
        produto1.setNome("Leite");
        produto1.setQuantidade(15);
        produto1.setPreco(6.50);

        Produto produto2= new Produto();
        produto2.setNome("Arroz");
        produto2.setQuantidade(7);
        produto2.setPreco(5);

        Produto produto3= new Produto();
        produto3.setNome("Bolacha");
        produto3.setQuantidade(10);
        produto3.setPreco(4);

        Loja loja= new Loja();

        loja.adcionarProduto(produto1);
        loja.adcionarProduto(produto2);
        loja.adcionarProduto(produto3);

        loja.listarProduto();
        System.out.println("---------------------------------------------------------------------------------------");
        loja.removerProduto(produto2);

        loja.listarProduto();
        System.out.println("---------------------------------------------------------------------------------------");
        Produto produto4= new Produto();
        produto4.setNome("Chocolate");

        loja.adcionarProduto(produto4);

        loja.listarProduto();
        System.out.println("---------------------------------------------------------------------------------------");

        loja.venderProduto(produto2,2);
        System.out.println("---------------------------------------------------------------------------------------");

        loja.listarProduto();
        System.out.println("---------------------------------------------------------------------------------------");

        loja.adicionarEstoque(produto4,2);

        loja.listarProduto();

        System.out.println("---------------------------------------------------------------------------------------");

        loja.venderProduto(produto4,2);

        loja.listarProduto();

        System.out.println("---------------------------------------------------------------------------------------");

        loja.removerProduto(produto1);
        loja.listarProduto();

        System.out.println("---------------------------------------------------------------------------------------");


        Produto produto5= new Produto();

        produto5.setNome("Bala");

        loja.adcionarProduto(produto5);

        loja.listarProduto();

        System.out.println("---------------------------------------------------------------------------------------");

        loja.adicionarEstoque(produto4,15);

        loja.listarProduto();
    }
}