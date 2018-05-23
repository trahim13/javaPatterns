package linker.ex1;

public class Start {
    public static void main(String[] args) {
        MenuComponent menuOne = new Menu("Menu one", "Simple description menu 1");
        MenuComponent menuTwo = new Menu("Menu two", "A simple description 2");
        MenuComponent menuThree = new Menu("Menu three", "A simple description 3");
        MenuComponent menuDesert = new Menu("DESERT MENU", "A simple DESERT");

        MenuComponent allMenu = new Menu("ALL MENU", "Thi is is the all menu.");

        allMenu.add(menuOne);
        allMenu.add(menuTwo);
        allMenu.add(menuThree);

        menuTwo.add(new MenuItem("Pasta", "Same spagetti", true, 3.55));

        menuTwo.add(menuDesert);
        menuDesert.add(new MenuItem("Apple pie", "Same apple pie", true, 1.32));

        Wailtress wailtress = new Wailtress(allMenu);
        wailtress.printMenu();

    }
}
