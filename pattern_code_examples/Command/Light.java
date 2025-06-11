// Light.java (Receptor)
public class Light {
    private String location;
    private boolean isOn = false;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        isOn = true;
        System.out.println(location + " Light is ON");
    }

    public void off() {
        isOn = false;
        System.out.println(location + " Light is OFF");
    }

    public boolean isOn() {
        return isOn;
    }
}
