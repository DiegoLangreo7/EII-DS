// Clase que representa un segundo "ConcreteProduct" en el patrón Factory Method.
public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Renderizando botón HTML</button>");
    }

    @Override
    public void onClick() {
        System.out.println("Acción al hacer clic en botón HTML: Enviar formulario");
    }
}
