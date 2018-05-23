package factory.method;

import factory.method.pizza.CurrentPizzaOne;
import factory.method.pizza.Pizza;

public class PizzaStoreOne extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {


        if (name.equals("One")) {
            return new CurrentPizzaOne();
        } else return null;
    }
}
