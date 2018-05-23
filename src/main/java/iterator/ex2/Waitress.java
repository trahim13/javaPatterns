package iterator.ex2;

import iterator.ex2.interfaces.Menu;

import java.util.Iterator;

public class Waitress {
    Menu menuOne;
    Menu menuTwo;
    Menu cafeMenu;

    public Waitress(Menu menuOne, Menu menuTwo, Menu cafeMenu) {
        this.menuOne = menuOne;
        this.menuTwo = menuTwo;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<ItemMenu> oneMenuIterator = menuOne.createIterator();
        Iterator<ItemMenu> twoMenuIterator = menuTwo.createIterator();
        Iterator<ItemMenu> cafeIterator = cafeMenu.createIterator();
        System.out.println("Menu one:");
        printMenu(oneMenuIterator);
        System.out.println();
        System.out.println("Menu two:");
        printMenu(twoMenuIterator);
        System.out.println();
        System.out.println("Cafe menu:");
        System.out.println();
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            ItemMenu itemMenu = (ItemMenu) iterator.next();
            System.out.println(itemMenu.getName());
            System.out.println(itemMenu.getDescription());
            System.out.println(itemMenu.getPrice());

        }

    }
}
