package state.ex2;

public class GumballMachine {
    private State soldOutState;
    private State soldState;
    private State hasQuarterState;
    private State noQuarterState;
    private State winnerState;

    private State state;
    private int count;

    public void refill(int count) {
        this.count += count;
        state = getNoQuarterState();
    }

    public GumballMachine(int count) {
        this.count = count;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }


    public void insertQuarter() {

        state.insertQuarter();
    }


    public void ejectQuarter() {
        state.ejectQuarter();
    }


    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gamble comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    public void setState(State state) {
        this.state = state;
    }
}
