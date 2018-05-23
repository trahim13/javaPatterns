package factory.factory.pizza;

import factory.factory.interfaces.PizzaIngredientFactory;

public class ChessePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ChessePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Готовим - " + name);
        sause = pizzaIngredientFactory.createSause();
        chesse = pizzaIngredientFactory.createChesse();
    }
}
