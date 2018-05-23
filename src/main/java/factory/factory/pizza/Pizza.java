package factory.factory.pizza;

import factory.factory.interfaces.Chesse;
import factory.factory.interfaces.Sause;

public abstract class Pizza {
    String name;
    Sause sause;
    Chesse chesse;

    public abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }

    public Sause getSause() {
        return sause;
    }

    public void setSause(Sause sause) {
        this.sause = sause;
    }

    public Chesse getChesse() {
        return chesse;
    }

    public void setChesse(Chesse chesse) {
        this.chesse = chesse;
    }
}
