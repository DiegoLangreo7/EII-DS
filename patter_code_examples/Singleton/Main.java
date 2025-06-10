// Clase para probar el patrón Singleton.
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();

        logger1.log("Aplicación iniciada desde dispositivo 1.");
        logger1.mostrarLogs();
        logger2.log("Aplicación iniciada desde dispositivo 2.");
        logger1.mostrarLogs();

        if (logger1 == logger2) {
            System.out.println("✔ Ambos son la misma instancia.");
        } else {
            System.out.println("❌ Son instancias diferentes.");
        }
    }
}
