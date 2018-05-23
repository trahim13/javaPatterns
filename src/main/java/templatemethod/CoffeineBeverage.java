package templatemethod;

public abstract class CoffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }

    void boilWater() {
        System.out.println("Boil water.");

    }

    void pourInCup() {
        System.out.println("Pour in cup.");
    }

    abstract void brew();

    abstract void addCondiments();
}
