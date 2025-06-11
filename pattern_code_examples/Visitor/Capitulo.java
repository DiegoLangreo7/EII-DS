// Representa la clase ConcreteElementB del UML del patrón Visitor	

public class Capitulo implements ElementoLibro {
    private final String titulo;
    private final int paginas;

    public Capitulo(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
