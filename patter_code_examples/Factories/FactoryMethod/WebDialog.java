// Clase que representa la segunda implementación del creador concreto en el patrón Factory Method.
public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
