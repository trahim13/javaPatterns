package iterator.ex2.interfaces;


import iterator.ex2.ItemMenu;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuOne implements Menu {
    ArrayList<ItemMenu> itemMenus = new ArrayList<>();

    public MenuOne() {
        addItem("Завтрак", "Запеченая картошка", true, 5);
        addItem("Обед", "Мясо цыплёнка", false, 2);
        addItem("Ужин", "Кабачок", true, 1);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        ItemMenu itemMenu = new ItemMenu(name, description, vegetarian, price);
        itemMenus.add(itemMenu);
    }

    public Iterator<ItemMenu> createIterator() {
        return itemMenus.iterator();
    }
}

