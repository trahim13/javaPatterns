package factory.simple;

import factory.simple.pizza.CurrentPizzaOne;
import factory.simple.pizza.CurrentPizzaTwo;
import factory.simple.pizza.Pizza;

public class SimplePizzaFactory {

    Pizza pizza;

    public Pizza createPizza(String name) {
        if (name.equals("One")) {
            return pizza = new CurrentPizzaOne();
        } else if (name.equals("Two")) {
            return pizza = new CurrentPizzaTwo();
        }

        return pizza;
    }
}
