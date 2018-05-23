package factory.factory.ingredients;

import factory.factory.interfaces.Chesse;
import factory.factory.interfaces.PizzaIngredientFactory;
import factory.factory.interfaces.Sause;

public class MeatPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sause createSause() {
        return new SauseTwo();
    }

    @Override
    public Chesse createChesse() {
        return new ChesseTwo();
    }
}
