public class Trem extends Transporte{

    @Override
    void carregar() {
        System.out.println("Trem carregado.");
    }

    @Override
    void descarregar() {
        System.out.println("Trem descarregado.");
    }
}
