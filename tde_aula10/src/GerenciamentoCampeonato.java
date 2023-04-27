public class GerenciamentoCampeonato {
    public static void main(String[] args) {
        Equipe equipe1= new Equipe("Equipe 1");
        Equipe equipe2= new Equipe("Equipe 2");
        Equipe equipe3= new Equipe("Equipe 2");

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

        System.out.println("Equipe 1"+ " V: " + equipe1.getVitorias()+ " | " + " D: " + +equipe1.getDerrotas() + " | "+" E: "+ + equipe1.empates) ;
        System.out.println("Equipe 2"+ " V: " + equipe2.getVitorias()+ " | " + " D: " + +equipe2.getDerrotas() + " | "+" E: "+ + equipe2.empates) ;
        System.out.println("Equipe 3"+ " V: " + equipe3.getVitorias()+ " | " + " D: " + +equipe3.getDerrotas() + " | "+" E: "+ + equipe3.empates) ;
    }
}