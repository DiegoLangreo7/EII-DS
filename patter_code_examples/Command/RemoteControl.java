// RemoteControl.java (Invoker)
import java.util.Stack;

public class RemoteControl {
    private Command slot;
    private Stack<Command> commandHistory = new Stack<>();

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void pressButton() {
        slot.execute();
        commandHistory.push(slot);
    }

    public void pressUndo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo");
        }
    }
}
