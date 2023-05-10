public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome= "Pedro";
        pessoa1.idade= 35;

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome= "João";
        funcionario1.idade= 27;
        funcionario1.cargo= "Gerente";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome= "Márcia";
        pessoa2.idade=19;

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome= "Claudia";
        funcionario2.idade= 27;
        funcionario2.cargo= "Atendente";

        System.out.println("Lista de pessoas:");
        pessoa1.exibirDados();
        pessoa2.exibirDados();

        System.out.println("Lista de Funcionários:");
        funcionario1.exibirDados();
        funcionario2.exibirDados();
    }
}