package templatemethod;

public class Tea extends CoffeineBeverage {
    @Override
    void brew() {
        System.out.println("Tea.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");

    }
}
