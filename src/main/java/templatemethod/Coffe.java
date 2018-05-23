package templatemethod;

public class Coffe extends CoffeineBeverage {
    @Override
    void brew() {
        System.out.println("Coffe.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk.");
    }
}
