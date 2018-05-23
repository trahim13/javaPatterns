package factory.method;

public class Start {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStoreOne();
        pizzaStore.orderPizza("One");
    }
}
