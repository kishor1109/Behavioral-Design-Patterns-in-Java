
public class Main {
    public static void main(String[] args) {

        Light light1=new Light();

        Fan fan=new Fan();

        Command lightOn=new LightOnCommand(light1);

        Command lightOff=new LightOffCommand(light1);

        Command fanOn=new FanOnCommand(fan);

        Command fanOff = new FanOffCommand(fan);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(fanOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.setCommand(fanOff);
        remote.pressButton();

    }
}



