package templatemethod.ex2;

public abstract class CoffeBevaregeInterceptor {

    public void prepareRecipe() {
        boilWater();
        brew();
        paurInCup();
        if (customerWantCondiments()) {

            addCondiments();
        }

    }

    void boilWater() {
        System.out.println("Boil water.");

    }

    void paurInCup() {
        System.out.println("Paur in cup.");

    }

    abstract void brew();

    abstract void addCondiments();

    boolean customerWantCondiments() {
        return true;
    }

}
