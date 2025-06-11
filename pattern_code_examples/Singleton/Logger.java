// Clase SINGLETON.

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instancia;
    private final List<String> historial; // Almacena todos los mensajes

    // Constructor privado
    private Logger() {
        historial = new ArrayList<>();
        System.out.println("Logger inicializado.");
    }

    // Método estático sincronizado (thread-safe)
    public static synchronized Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    // Método para registrar y almacenar mensajes
    public void log(String mensaje) {
        String entrada = "[LOG] " + mensaje;
        historial.add(entrada);
    }

    // Método para mostrar todos los logs almacenados
    public void mostrarLogs() {
        System.out.println("=== HISTORIAL DE LOGS ===");
        for (String entrada : historial) {
            System.out.println(entrada);
        }
        System.out.println("==========================");
    }
}
