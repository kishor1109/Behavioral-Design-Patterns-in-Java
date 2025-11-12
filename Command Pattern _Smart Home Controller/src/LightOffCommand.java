public class LightOffCommand implements Command{

    private Light light1;

    public LightOffCommand(Light light1){
        this.light1=light1;
    }
    @Override
    public void execute() {

        light1.turnOff();

    }

    @Override
    public void undo() {
        light1.turnOn();

    }
}
