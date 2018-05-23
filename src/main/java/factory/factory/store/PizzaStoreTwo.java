package factory.factory.store;

import factory.factory.ingredients.MeatPizzaIngredientFactory;
import factory.factory.interfaces.PizzaIngredientFactory;
import factory.factory.pizza.MeatPizza;
import factory.factory.pizza.Pizza;

public class PizzaStoreTwo extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new MeatPizzaIngredientFactory();

        if (name.equals("meat")) {
            pizza = new MeatPizza(ingredientFactory);
            pizza.setName("Meat pizza");
            return pizza;
        } else {
            return null;
        }
    }
}
