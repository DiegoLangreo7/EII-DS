// Clase que representa la primera implementación del creador concreto en el patrón Factory Method.
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
