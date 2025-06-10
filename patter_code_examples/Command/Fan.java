// Fan.java (Receptor)
public class Fan {
    private String location;
    private boolean isOn = false;

    public Fan(String location) {
        this.location = location;
    }

    public void on() {
        isOn = true;
        System.out.println(location + " Fan is ON");
    }

    public void off() {
        isOn = false;
        System.out.println(location + " Fan is OFF");
    }

    public boolean isOn() {
        return isOn;
    }
}
