package state.ex2;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, but gumball machine is empty.");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, but gumball machine is empty. Returned quarter.");

    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, but gumball machine is empty. Returned quarter.");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry, but gumball machine is empty. Returned quarter.");
    }
}
