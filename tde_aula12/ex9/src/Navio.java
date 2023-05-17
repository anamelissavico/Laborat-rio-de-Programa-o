public class Navio extends Transporte{
    @Override
    void carregar() {
        System.out.println("Navio carregado.");
    }

    @Override
    void descarregar() {
        System.out.println("Navio descarregado.");
    }
}
