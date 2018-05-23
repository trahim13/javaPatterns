package iterator.ex1;

import java.util.ArrayList;

public class MenuOneIterator implements Iterator {


    public MenuOneIterator(ArrayList<ItemMenu> itemMenus) {
        this.itemMenus = itemMenus;
    }

    ArrayList<ItemMenu> itemMenus;
    int possition = 0;

    @Override
    public boolean hasNext() {
        return possition < itemMenus.size() && itemMenus.get(possition) != null;
    }

    @Override
    public Object next() {
        ItemMenu itemMenu = itemMenus.get(possition);
        possition++;
        return itemMenu;
    }
}
