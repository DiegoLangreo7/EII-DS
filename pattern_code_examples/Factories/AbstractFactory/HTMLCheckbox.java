// Representa la clase concreta "ConcreteProductB2" en el patrón Abstract Factory
public class HTMLCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("<input type='checkbox' /> Checkbox HTML renderizado.");
    }
}
