public class Main {
    public static void main(String[] args) {
        Turma turma= new Turma();

        Aluno primeiroAluno=new Aluno();
        Aluno segundoAluno=new Aluno();
        Aluno terceiroAluno=new Aluno();

        turma.aluno1=primeiroAluno;
        turma.aluno2=segundoAluno;
        turma.aluno3=terceiroAluno;

        primeiroAluno.prova1=new Prova();
        primeiroAluno.prova2=new Prova();
        segundoAluno.prova1=new Prova();
        segundoAluno.prova2=new Prova();
        terceiroAluno.prova1=new Prova();
        terceiroAluno.prova2=new Prova();

        primeiroAluno.prova1.notaParte1=4.0;
        primeiroAluno.prova1.notaParte2=2.5;
        primeiroAluno.prova2.notaParte1=1.0;
        primeiroAluno.prova2.notaParte2=7.0;

        segundoAluno.prova1.notaParte1=6.5;
        segundoAluno.prova1.notaParte2=3.5;
        segundoAluno.prova2.notaParte1=0.0;
        segundoAluno.prova2.notaParte2=3.0;

        terceiroAluno.prova1.notaParte1=8.0;
        terceiroAluno.prova1.notaParte2=4.0;
        terceiroAluno.prova2.notaParte1=6.0;
        terceiroAluno.prova2.notaParte2=1.5;

        System.out.println("A média do primeiro aluno é " + primeiroAluno.calcularMedia());
        System.out.println("A média do segundo aluno é " + segundoAluno.calcularMedia());
        System.out.println("A média do terceiro aluno é " + terceiroAluno.calcularMedia());

        System.out.println("A média da turma é "+ turma.calcularMedia());


    }
}