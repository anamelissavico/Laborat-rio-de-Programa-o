public class Estagiario extends Funcionario{

    @Override
    void calcularSalario() {
        System.out.println("O salário do estagiário é 850 reais.");
    }

    @Override
    void realizarTarefa() {
        System.out.println("Realize a seguinte tarefa.");
    }
}
