package factory.factory.store;

import factory.factory.ingredients.ChessePizzaIngredientFactory;
import factory.factory.interfaces.PizzaIngredientFactory;
import factory.factory.pizza.ChessePizza;
import factory.factory.pizza.Pizza;

public class PizzaStoreChesse extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new ChessePizzaIngredientFactory();

        if (name.equals("chesse")) {
            pizza = new ChessePizza(ingredientFactory);
            pizza.setName("Chesse pizza");
            return pizza;

        } else {
            return null;
        }
    }
}
