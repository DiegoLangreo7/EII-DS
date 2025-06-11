// Representa la clase ConcreteVisitor1 del UML del patrón Visitor	

public class VisitanteConteoPaginas implements Visitor {
    private int totalPaginas = 0;

    @Override
    public void visit(Capitulo capitulo) {
        totalPaginas += capitulo.getPaginas();
    }

    @Override
    public void visit(Portada portada) {
        totalPaginas += 1; // asumimos 1 página para la portada
    }

    public int obtenerTotalPaginas() {
        return totalPaginas;
    }
}
