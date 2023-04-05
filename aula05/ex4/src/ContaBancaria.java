public class ContaBancaria {
    double numeroDaConta;
    double saldo;
    String titular;

    double depositar(double valor){
        saldo= saldo+valor;
        return saldo;
    }

    double sacar(double valor){
        if(valor<=saldo){
            saldo=saldo-valor;
        }
        return saldo;
    }

    double transferir(double valor){
    }
}
