package factory.factory.store;

import factory.factory.pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String name) {
        Pizza pizza;

        pizza = createPizza(name);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String name);
}
