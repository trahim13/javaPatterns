package iterator.ex1;

public class Start {
    public static void main(String[] args) {
        MenuOne menuOne = new MenuOne();
        MenuTwo menuTwo = new MenuTwo();

        Waitress waitress = new Waitress(menuOne, menuTwo);
        waitress.printMenu();

    }
}
