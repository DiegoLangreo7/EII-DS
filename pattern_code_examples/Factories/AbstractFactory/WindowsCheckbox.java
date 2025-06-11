// Representa la clase concreta "ConcreteProductB1" en el patrón Abstract Factory
public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("[WindowsCheckbox] Checkbox estilo Windows renderizado.");
    }
}
