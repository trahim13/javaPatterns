package command.ex1.classes;

import command.ex1.interfaces.Command;
import command.ex1.obj.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
