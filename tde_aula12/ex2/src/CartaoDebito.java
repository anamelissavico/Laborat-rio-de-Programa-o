public class CartaoDebito extends Pagamento {
    @Override
    void emitirRecibo() {
        System.out.println("Recibo de pagamento.");
    }

    @Override
    void realizarPagamento() {
        System.out.println("Pagamento realizado.");
    }
}
