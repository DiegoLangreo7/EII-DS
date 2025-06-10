// Simularia el cliente que usa el patrón Factory Method para crear diálogos específicos según el sistema operativo.
public class Main {
    public static void main(String[] args) {
        Dialog dialog;

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new WebDialog();
        }

        dialog.renderWindow(); // No importa qué tipo de botón se cree
    }
}
