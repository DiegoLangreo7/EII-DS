// Representa la clase concreta "ConcreteFactory2" en el patrón Abstract Factory
public class WebFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new HTMLCheckbox();
    }
}
