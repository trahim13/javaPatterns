package factory.simple.pizza;

public class CurrentPizzaOne extends Pizza {
    public CurrentPizzaOne() {
        name = "PizzaOne";
        souse = "Соус 1";

        toppings.add("Нарезка сыра");
        toppings.add("Лук");
        toppings.add("Грибы");
    }
}
