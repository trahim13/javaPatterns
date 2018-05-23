package factory.factory;

import factory.factory.store.PizzaStore;
import factory.factory.store.PizzaStoreChesse;

public class Start {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStoreChesse();
        pizzaStore.orderPizza("chesse");
    }
}
