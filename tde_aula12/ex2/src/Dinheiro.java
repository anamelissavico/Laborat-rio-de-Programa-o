public class Dinheiro extends Pagamento{

    @Override
    void emitirRecibo() {
        System.out.println("Recibo de pagamento.");
    }

    @Override
    void realizarPagamento() {
        System.out.println("Pagamento realizado.");
    }

}
