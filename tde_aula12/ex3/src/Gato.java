public class Gato extends Animal{

    @Override
    void comer() {
        System.out.println("Gato comendo.");
    }

    @Override
    void dormir() {
        System.out.println("Gato dormindo.");
    }

    @Override
    void mover() {
        System.out.println("Gato movendo-se.");
    }
}
