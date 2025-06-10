// Main.java (Cliente)
public class Main {
    public static void main(String[] args) {
        // Receptores
        Light livingRoomLight = new Light("Living Room");
        Fan bedroomFan = new Fan("Bedroom");

        // Comandos
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command bedroomFanOn = new FanOnCommand(bedroomFan);
        Command bedroomFanOff = new FanOffCommand(bedroomFan);

        // Invocador
        RemoteControl remote = new RemoteControl();

        // Ejecutar comandos
        remote.setCommand(livingRoomLightOn);
        remote.pressButton();  // Living Room Light is ON

        remote.setCommand(bedroomFanOn);
        remote.pressButton();  // Bedroom Fan is ON

        remote.setCommand(livingRoomLightOff);
        remote.pressButton();  // Living Room Light is OFF

        remote.setCommand(bedroomFanOff);
        remote.pressButton();  // Bedroom Fan is OFF

        // Deshacer comandos en orden inverso
        remote.pressUndo();    // Bedroom Fan is ON
        remote.pressUndo();    // Living Room Light is ON
        remote.pressUndo();    // Bedroom Fan is OFF
        remote.pressUndo();    // Living Room Light is OFF
        remote.pressUndo();    // No commands to undo
    }
}
