public class Equipe {
    String nome;
    int vitorias;
    int derrotas;
    int empates;

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
    }

    void registrarDerrota(){
        this.derrotas++;
    }

    void registrarEmpate(){
        this.empates++;
    }



}
