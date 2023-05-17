public class Caminhao extends Transporte{
    @Override
    void carregar() {
        System.out.println("Caminhão carregado.");
    }

    @Override
    void descarregar() {
        System.out.println("Caminhão descarregado.");
    }
}
