// Clase que representa un primero "ConcreteProduct" en el patrón Factory Method.
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("[WindowsButton] Renderizando botón estilo Windows");
    }

    @Override
    public void onClick() {
        System.out.println("[WindowsButton] Acción al hacer clic: Guardar archivo");
    }
}
