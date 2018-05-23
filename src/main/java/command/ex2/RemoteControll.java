package command.ex2;

import command.ex2.comands.NoCommand;
import command.ex2.interfaces.Command;

public class RemoteControll {
    private Command onCommands[];
    private Command offCommands[];
    private Command undoCommand;

    public RemoteControll() {
        onCommands = new Command[7];
        offCommands = new Command[7];


        for (int i = 0; i < offCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

        undoCommand = new NoCommand();
//        undoCommand = ()->{}; ///void undo();

    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----Remote control----\n");
        return stringBuffer.toString();
    }
}
