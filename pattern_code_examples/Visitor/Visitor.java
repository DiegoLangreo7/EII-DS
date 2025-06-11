// Representa la interfaz Visitor del UML del patrón Visitor	

public interface Visitor {

    // Define los métodos visit que implementará cada clase concreta de element
    void visit(Capitulo capitulo);
    void visit(Portada portada);
}
