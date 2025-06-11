// Representa la interfaz Prototype del UML del patron Prototype.

public interface Figura extends Cloneable {

    // Lo fundamental es que declare el metodo de clonación de los objetos a crear.
    Figura clonar();

    // Luego, otros metodos que pueden ser necesarios para las figuras.
    void mostrar();
}