package iterator.ex2.interfaces;

import iterator.ex2.ItemMenu;

import java.util.Iterator;

public interface Menu {
    Iterator<ItemMenu> createIterator();
}
