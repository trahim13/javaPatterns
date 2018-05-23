package iterator.ex2;


import java.util.Iterator;

public class MenuTwoIterator implements Iterator {


    ItemMenu[] menus;
    int possition = 0;

    public MenuTwoIterator(ItemMenu[] menus) {
        this.menus = menus;
    }

    @Override
    public boolean hasNext() {
        return possition < menus.length && menus[possition] != null;
    }

    @Override
    public Object next() {
        ItemMenu itemMenu = menus[possition];
        possition++;
        return itemMenu;
    }

    @Override
    public void remove() {
        if (possition <= 0) {
            throw new IllegalStateException("You can't delete until.");
        }
        if (menus[possition - 1] != null) {
            for (int i = possition - 1; i < (menus.length - 1); i++) {
                menus[i] = menus[i + 1];
            }
            menus[menus.length - 1] = null;
        }
    }
}
