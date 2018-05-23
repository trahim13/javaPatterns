package iterator.ex2.interfaces;

import iterator.ex2.ItemMenu;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {
    HashMap<String, ItemMenu> hashMap = new HashMap<>();

    public CafeMenu() {
        addItem("Бургер и овощной салат", "Вегетарианская пища", true, 11.9);
        addItem("Миска супа", "Куриные потрашки", false, 2.99);
        addItem("Острый буритто", "Буритто с чили и сыром.", false, 5.44);

    }

    void addItem(String name, String description, boolean vegetarian, double price) {
        ItemMenu itemMenu = new ItemMenu(name, description, vegetarian, price);
        hashMap.put(itemMenu.getName(), itemMenu);
    }

    @Override
    public Iterator<ItemMenu> createIterator() {
        return hashMap.values().iterator();
    }
}
