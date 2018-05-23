package iterator.ex1;

import java.util.ArrayList;

public class MenuOne {
    ArrayList<ItemMenu> itemMenus = new ArrayList<>();

    public void addItem(String name, String description, boolean vegetarian, double price) {
        ItemMenu itemMenu = new ItemMenu(name, description, vegetarian, price);
        itemMenus.add(itemMenu);
    }

    public MenuOne() {
        addItem("Завтрак", "Запеченая картошка", true, 5);
        addItem("Обед", "Мясо цыплёнка", false, 2);
        addItem("Ужин", "Кабачок", true, 1);

    }

    Iterator createIterator() {
        return new MenuOneIterator(itemMenus);
    }
}

