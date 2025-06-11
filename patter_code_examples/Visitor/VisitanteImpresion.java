// Representa la clase ConcreteVisitor2 del UML del patrón Visitor	

public class VisitanteImpresion implements Visitor {
    @Override
    public void visit(Capitulo capitulo) {
        System.out.println("Capítulo: " + capitulo.getTitulo() + " (" + capitulo.getPaginas() + " páginas)");
    }

    @Override
    public void visit(Portada portada) {
        System.out.println("Portada: \"" + portada.getTituloDelLibro() + "\" por " + portada.getAutor());
    }
}
