public class ContaCorrente extends Conta{
    double limite;

    void exibirDados(){
        System.out.println("--------------------------------------------------");
        System.out.println("Número da conta: "+ numero);
        System.out.println("Saldo da conta: "+ saldo);
        System.out.println("Limite da conta: "+ limite);
    }
}
