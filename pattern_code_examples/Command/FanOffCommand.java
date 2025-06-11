// FanOffCommand.java (ConcreteCommand)
public class FanOffCommand implements Command {
    private final Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }

    @Override
    public void undo() {
        fan.on();
    }
}
