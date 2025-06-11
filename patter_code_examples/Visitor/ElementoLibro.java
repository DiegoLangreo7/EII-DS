// Representa la interfaz Element del UML del patrón Visitor	

public interface ElementoLibro {
    // Define el método accept que implementaran los elementos del libro
    void accept(Visitor visitante);
}
