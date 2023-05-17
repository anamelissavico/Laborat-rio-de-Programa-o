public class Cachorro extends Animal{

    @Override
    void comer() {
        System.out.println("Cachorro comendo.");
    }

    @Override
    void dormir() {
        System.out.println("Cachorro dormindo.");
    }

    @Override
    void mover() {
        System.out.println("Cachorro movendo-se.");
    }
}
