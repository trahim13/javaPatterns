package command.ex1;

import command.ex1.classes.LightOnCommand;
import command.ex1.obj.Light;

public class Start {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        SimpleRemoteControll simpleRemoteControll = new SimpleRemoteControll();
        simpleRemoteControll.setCommand(lightOnCommand);
        simpleRemoteControll.buttonPressed();

        simpleRemoteControll.setCommand(() -> System.out.println("Light Off"));
        simpleRemoteControll.buttonPressed();
    }
}
