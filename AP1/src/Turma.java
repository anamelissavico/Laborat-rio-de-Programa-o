public class Turma {
    Aluno aluno1;
    Aluno aluno2;
    Aluno aluno3;

    double calcularMedia(){
        double mediaTotal=(aluno1.calcularMedia()+ aluno2.calcularMedia()+ aluno3.calcularMedia())/3;
        if (aluno1.calcularMedia()==0 || aluno2.calcularMedia()==0 || aluno3.calcularMedia()==0){
            System.out.println("Um dos alunos está com a média zerada porque a soma das suas notas deu mais que 10, revise.");
        }
        return mediaTotal;
    }
}

