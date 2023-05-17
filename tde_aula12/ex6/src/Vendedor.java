public class Vendedor extends Funcionario{

    @Override
    void calcularSalario() {
        System.out.println("O salário do vendedor é 1800 reais.");
    }

    @Override
    void realizarTarefa() {
        System.out.println("Realize a seguinte tarefa.");
    }
}
