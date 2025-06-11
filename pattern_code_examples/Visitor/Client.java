// Representa la clase Cliente del UML del patrón Visitor	

public class Client {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.agregarElemento(new Portada("Aprende Patrones de Diseño", "Carlos García"));
        libro.agregarElemento(new Capitulo("Introducción al Diseño", 12));
        libro.agregarElemento(new Capitulo("Patrón Visitor", 24));

        // Visitante para imprimir
        VisitanteImpresion printVisitor = new VisitanteImpresion();
        libro.aceptar(printVisitor);

        // Visitante para contar páginas
        VisitanteConteoPaginas countVisitor = new VisitanteConteoPaginas();
        libro.aceptar(countVisitor);
        System.out.println("Total de páginas del libro: " + countVisitor.obtenerTotalPaginas());
    }
}
