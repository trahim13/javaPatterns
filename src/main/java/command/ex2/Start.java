package command.ex2;

import command.ex2.comands.LightOffCommand;
import command.ex2.comands.LightOnCommand;
import command.ex2.comands.StereoOffCommand;
import command.ex2.comands.StereoOnCommand;
import command.ex2.objects.Light;
import command.ex2.objects.Stereo;

public class Start {
    public static void main(String[] args) {
        Light light = new Light();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        RemoteControll remoteControll = new RemoteControll();
        remoteControll.setCommands(0, lightOnCommand, lightOffCommand);
        remoteControll.setCommands(1, stereoOnCommand, stereoOffCommand);

        remoteControll.onButtonWasPushed(0);
        remoteControll.onButtonWasPushed(1);

        System.out.println("---------------");

        remoteControll.offButtonWasPushed(1);
        remoteControll.offButtonWasPushed(0);

        System.out.println("------------- undo -------------");

        remoteControll.offButtonWasPushed(1);
        System.out.println("----------------undo");
        remoteControll.undoButtonWasPushed();
        remoteControll.onButtonWasPushed(0);
        System.out.println("-----------------undo");
        remoteControll.undoButtonWasPushed();
    }
}
