public class Gerente extends Funcionario{
    @Override
    void calcularSalario() {
        System.out.println("O salário do gerente é 7000 reais.");
    }

    @Override
    void realizarTarefa() {
        System.out.println("Realize a seguinte tarefa.");
    }
}
