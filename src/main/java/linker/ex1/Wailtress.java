package linker.ex1;

public class Wailtress {
    MenuComponent menuComponent;

    public Wailtress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu() {
        menuComponent.print();
    }
}
