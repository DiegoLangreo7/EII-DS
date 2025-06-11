// Representa la clase Client del UML del patron Prototype.

public class Client {
    private final Figura prototype;

    public Client(Figura prototipo) {
        this.prototype = prototipo;
    }

    public Figura operacion() {
        Figura figuraClonada = prototype.clonar();
        System.out.println("Figura clonada desde cliente:");
        figuraClonada.mostrar();
        return figuraClonada;
    }
}

