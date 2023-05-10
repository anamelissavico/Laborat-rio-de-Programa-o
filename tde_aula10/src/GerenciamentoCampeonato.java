public class GerenciamentoCampeonato {
    public static void main(String[] args) {
        Equipe equipe1= new Equipe("Equipe 1");
        Equipe equipe2= new Equipe("Equipe 2");
        Equipe equipe3= new Equipe("Equipe 3");

        equipe1.registrarVitoria();
        equipe1.registrarVitoria();
        equipe1.registrarVitoria();
        equipe1.registrarDerrota();
        equipe1.registrarDerrota();
        equipe1.registrarEmpate();

        equipe2.registrarDerrota();
        equipe2.registrarEmpate();
        equipe2.registrarEmpate();

        equipe3.registrarVitoria();
        equipe3.registrarVitoria();
        equipe3.registrarDerrota();


        equipe1.exibirInformacoes();
        equipe2.exibirInformacoes();
        equipe3.exibirInformacoes();

    }
}