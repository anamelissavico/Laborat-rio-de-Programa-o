public class Carro extends Veiculo {
    int numPassageiros;

    void exibirDados(){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de passageiros: " + numPassageiros);
    }
}
