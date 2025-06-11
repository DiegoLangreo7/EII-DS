// Para probar el patrón Abstract Factory.
public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new WebFactory();
        }

        Client client = new Client(factory);
        client.renderUI();
    }
}
