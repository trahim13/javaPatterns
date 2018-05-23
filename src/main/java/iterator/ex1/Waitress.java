package iterator.ex1;

public class Waitress {
    MenuOne menuOne;
    MenuTwo menuTwo;

    public Waitress(MenuOne menuOne, MenuTwo menuTwo) {
        this.menuOne = menuOne;
        this.menuTwo = menuTwo;
    }

    public void printMenu() {
        Iterator oneMenuIterator = menuOne.createIterator();
        Iterator twoMenuIterator = menuTwo.createIterator();
        System.out.println("Menu one:");
        printMenu(oneMenuIterator);
        System.out.println("Menu two:");
        printMenu(twoMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            ItemMenu itemMenu = (ItemMenu) iterator.next();
            System.out.println(itemMenu.getName());
            System.out.println(itemMenu.getDescription());
            System.out.println(itemMenu.getPrice());
            System.out.println();
        }

    }
}
