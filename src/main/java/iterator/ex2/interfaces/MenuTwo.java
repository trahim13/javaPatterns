package iterator.ex2.interfaces;


import iterator.ex2.ItemMenu;
import iterator.ex2.MenuTwoIterator;

import java.util.Iterator;

public class MenuTwo implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItem = 0;
    ItemMenu[] itemMenus;


    public MenuTwo() {
        itemMenus = new ItemMenu[MAX_ITEMS];
        addItem("Полдник", "Йогург", true, 5);
        addItem("Ссабойка", "Бутербоды", false, 2);
        addItem("Заначка", "Конфета", true, 1);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        ItemMenu itemMenu = new ItemMenu(name, description, vegetarian, price);
        if (numberOfItem >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full.");
        } else {
            itemMenus[numberOfItem] = itemMenu;
            numberOfItem++;
        }
    }

    public Iterator<ItemMenu> createIterator() {
        return new MenuTwoIterator(itemMenus);
    }


}
