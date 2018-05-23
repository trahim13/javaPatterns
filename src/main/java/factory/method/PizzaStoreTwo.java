package factory.method;

import factory.method.pizza.CurrentPizzaTwo;
import factory.method.pizza.Pizza;

public class PizzaStoreTwo extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        if (name.equals("Two")) {
            return new CurrentPizzaTwo();
        } else return null;
    }
}
