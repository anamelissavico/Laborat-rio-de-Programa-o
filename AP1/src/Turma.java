public class Turma {
    Aluno aluno1;
    Aluno aluno2;
    Aluno aluno3;

    double calcularMedia(){
        double mediaTotal=(aluno1.calcularMedia()+ aluno2.calcularMedia()+ aluno3.calcularMedia())/3;
        return mediaTotal;
    }
}

