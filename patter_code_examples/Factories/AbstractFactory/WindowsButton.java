// Representa la clase concreta "ConcreteProductA1" en el patrón Abstract Factory
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("[WindowsButton] Botón estilo Windows renderizado.");
    }
}
