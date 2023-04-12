public class Loja {
    Produto produto1;
    Produto produto2;
    Produto produto3;

    void adcionarProduto(Produto produto){
        if (produto1 == null) {
            this.produto1 = produto;
        }
        else if (produto2==null){
            this.produto2=produto;
        }
        else if (produto3==null){
            this.produto3=produto;
        }
        else{
            System.out.println("O estoque de produtos está cheio, libere um espaço para poder continuar adicionando itens!");
        }
    }

    void removerProduto(Produto produto){
        if (produto==produto1){
            this.produto1=null;
        }
        else if (produto==produto2){
            this.produto2=null;
        }
        else if (produto==produto3){
            this.produto3=null;
        }
        else{
            System.out.println("Esse produto não existe em estoque.");
        }

    }
     
    void listarProduto() {
        if (produto1!=null) {
            System.out.println("Produto: "+produto1.nome + "| Estoque: "+ produto1.quantidade);
        }
        if (produto2!=null) {
            System.out.println("Produto: " + produto2.nome + "| Estoque: " + produto2.quantidade);
        }
        if (produto3!=null){
            System.out.println("Produto: " + produto3.nome + "| Estoque: " + produto3.quantidade);
        }
    }

    void venderProduto(Produto produto, int quantidade) {
        if (produto == produto1 && quantidade <= produto1.quantidade) {
            produto1.quantidade = produto1.quantidade - quantidade;
        }
        else if (produto == produto2 && quantidade <= produto2.quantidade) {
            produto2.quantidade = produto2.quantidade - quantidade;
        }
        else if (produto == produto3 && quantidade <= produto3.quantidade) {
            produto3.quantidade = produto3.quantidade - quantidade;
        }
        else {
            System.out.println("Esse item não possui quantidade em estoque suficiente para essa venda.");
        }
    }

    void adicionarEstoque(Produto produto, int qtde){
        if(produto==produto1){
            produto1.setQuantidade(produto1.getQuantidade() + qtde);
        }
        if(produto==produto2){
            produto2.setQuantidade(produto2.getQuantidade()+qtde);
        }
        if(produto==produto3){
            produto3.setQuantidade(produto3.getQuantidade()+qtde);
        }
    }
}

