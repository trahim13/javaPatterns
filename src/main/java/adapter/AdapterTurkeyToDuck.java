package adapter;

public class AdapterTurkeyToDuck implements Duck {
    Turkey turkey;

    public AdapterTurkeyToDuck(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.go();

    }
}
