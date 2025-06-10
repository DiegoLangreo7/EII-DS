// Clase abstracta que define el método de fábrica y el comportamiento común para todos los diálogos.
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton(); // Factory Method
        okButton.render();
        okButton.onClick();
    }

    // Factory Method
    public abstract Button createButton();
}
