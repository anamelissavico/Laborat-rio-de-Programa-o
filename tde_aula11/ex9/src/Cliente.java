public class Cliente extends Pessoa{
    double numeroCartao;

    void exibirDetalhes(){
        System.out.println(nome+ ","+ endereco + "," + numeroCartao);
    }
}
