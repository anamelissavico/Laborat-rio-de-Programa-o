public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.marca= "Chevrolet";
        veiculo1.modelo= "Onix";

        Veiculo veiculo2 = new Veiculo();
        veiculo2.marca = "Fiat";
        veiculo2.modelo= "Fiat Uno";

        Carro carro1 = new Carro();
        carro1.marca = "Chevrolet";
        carro1.modelo= "Captiva";
        carro1.numPassageiros= 7;

        Carro carro2 = new Carro();
        carro2.marca= "Volkswagen";
        carro2.modelo= "Gol Confortline";
        carro2.numPassageiros=5;

        System.out.println("Lista de veículos:");
        veiculo1.exibirDados();
        veiculo2.exibirDados();

        System.out.println("Lista de carros:");
        carro1.exibirDados();
        carro2.exibirDados();


    }
}