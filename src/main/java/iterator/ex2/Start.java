package iterator.ex2;

import iterator.ex2.interfaces.CafeMenu;
import iterator.ex2.interfaces.Menu;
import iterator.ex2.interfaces.MenuOne;
import iterator.ex2.interfaces.MenuTwo;

public class Start {
    public static void main(String[] args) {
        Menu menuOne = new MenuOne();
        Menu menuTwo = new MenuTwo();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(menuOne, menuTwo, cafeMenu);
        waitress.printMenu();
    }
}
