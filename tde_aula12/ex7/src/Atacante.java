public class Atacante extends Jogador {
    @Override
    void atacar() {
        System.out.println("Atacante está atacando.");
    }

    @Override
    void defender() {
        System.out.println("Atacante defendendo.");
    }
}
