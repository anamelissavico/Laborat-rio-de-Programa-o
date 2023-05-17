public class ArquivoImagem extends Arquivo{

    @Override
    void abrir() {
        System.out.println("Abrindo arquivo.");
    }

    @Override
    void fechar() {
        System.out.println("Fechando arquivo.");
    }
}
