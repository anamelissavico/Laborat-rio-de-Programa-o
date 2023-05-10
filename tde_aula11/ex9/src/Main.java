public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome="João";
        pessoa1.endereco= "Rua 1";

        pessoa1.exibirDetalhes();

        Cliente cliente1 = new Cliente();
        cliente1.nome= "Jorge";
        cliente1.endereco="Rua 2";
        cliente1.numeroCartao=231261654;

        cliente1.exibirDetalhes();

    }
}