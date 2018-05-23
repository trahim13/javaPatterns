package factory.method.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String souse;

     List<String> toppings = new ArrayList<>();

   public void prepare() {
        System.out.println("Готовим - " + name);
        System.out.println("Добавляем - " + souse);
        System.out.println("Набор добавок:");
        for (String a :
                toppings) {
            System.out.println(" " + a);
        }
    }

    public void bake() {
        System.out.println("Bake");
    }

    public void cut() {
        System.out.println("Cut");

    }

   public void box() {
        System.out.println("Box");
    }

    public String getName() {
        return name;
    }

    public String getSouse() {
        return souse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSouse(String souse) {
        this.souse = souse;
    }
}
