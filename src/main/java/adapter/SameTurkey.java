package adapter;

public class SameTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble!");
    }

    @Override
    public void go() {
        System.out.println("I'm turkey, i'm gooing!");

    }
}
