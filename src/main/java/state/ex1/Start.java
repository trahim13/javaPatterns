package state.ex1;

public class Start {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(4);

        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
//        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
    }
}
