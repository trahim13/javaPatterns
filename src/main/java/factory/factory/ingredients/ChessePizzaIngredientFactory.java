package factory.factory.ingredients;

import factory.factory.ingredients.ChesseOne;
import factory.factory.ingredients.SauseOne;
import factory.factory.interfaces.Chesse;
import factory.factory.interfaces.PizzaIngredientFactory;
import factory.factory.interfaces.Sause;

public class ChessePizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sause createSause() {
        return new SauseOne();
    }

    @Override
    public Chesse createChesse() {
        return new ChesseOne();
    }
}
