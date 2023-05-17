public class ArquivoTexto extends Arquivo{
    @Override
    void abrir() {
        System.out.println("Abrindo arquivo.");
    }

    @Override
    void fechar() {
        System.out.println("Fechando arquivo.");
    }
}
