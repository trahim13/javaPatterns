package command.ex2.comands;

import command.ex2.interfaces.Command;
import command.ex2.objects.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();

    }

    @Override
    public void undo() {
        light.off();
    }
}
