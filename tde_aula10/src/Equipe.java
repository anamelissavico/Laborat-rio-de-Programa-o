public class Equipe {
    String nome;
    int vitorias;
    int derrotas;
    int empates;
    int pontos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public Equipe(String nome){
        this.nome=nome;
        this.derrotas=0;
        this.vitorias=0;
        this.empates=0;
    }

    void registrarVitoria(){
        this.vitorias++;
        this.pontos=pontos+3;
    }

    void registrarDerrota(){
        this.derrotas++;
    }

    void registrarEmpate(){
        this.empates++;
        this.pontos++;
    }

    double calcularAproveitamento(){
        int totalJogos= this.vitorias+this.empates+this.derrotas;
        int totalPontosPossiveis= totalJogos*3;
        double aproveitamento= (pontos*100)/totalPontosPossiveis;
        return aproveitamento;
    }

    void exibirInformacoes(){

        System.out.println(nome);
        System.out.println("O total de pontos da equipe é:"+ pontos);
        System.out.println("O total de vitórias da equipe é:"+ vitorias);
        System.out.println("O total de derrotas da equipe é:"+ derrotas);
        System.out.println("O total de empates da equipe é:"+ empates);
        System.out.println("O total de aproveitamento da equipe é:" + calcularAproveitamento() + "%");
        System.out.println("------------------------------------------------------");

    }
}
