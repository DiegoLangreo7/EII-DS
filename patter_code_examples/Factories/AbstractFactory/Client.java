// Representa esa clase cliente que solo utiliza las abstracciones.
public class Client {
    private final Button button;
    private final Checkbox checkbox;

    public Client(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }
}
