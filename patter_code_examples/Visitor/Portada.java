// Representa la clase ConcreteElementA del UML del patrón Visitor	

public class Portada implements ElementoLibro {
    private final String tituloDelLibro;
    private final String autor;

    public Portada(String tituloDelLibro, String autor) {
        this.tituloDelLibro = tituloDelLibro;
        this.autor = autor;
    }

    public String getTituloDelLibro() {
        return tituloDelLibro;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
