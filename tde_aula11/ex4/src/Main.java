public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo=2000;
        conta1.numero= 25648794;

        Conta conta2 = new Conta();
        conta2.numero= 87958245;
        conta2.saldo=5000;

        ContaCorrente contaCorrente1 = new ContaCorrente();
        contaCorrente1.saldo= 100;
        contaCorrente1.numero=7845139;
        contaCorrente1.limite=2500;

        ContaCorrente contaCorrente2 = new ContaCorrente();
        contaCorrente2.numero= 6454879;
        contaCorrente2.saldo=600;
        contaCorrente2.limite=5000;

        System.out.println("Lista de contas:");
        conta1.exibirDados();
        conta2.exibirDados();

        System.out.println("Lista de contas correntes: ");
        contaCorrente1.exibirDados();
        contaCorrente2.exibirDados();

    }
}