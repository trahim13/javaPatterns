package command.ex1;

import command.ex1.interfaces.Command;

public class SimpleRemoteControll {
    Command slot;

    public SimpleRemoteControll() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonPressed() {
        slot.execute();

    }
}
