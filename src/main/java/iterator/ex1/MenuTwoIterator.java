package iterator.ex1;

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
}
