// Representa la clase ConcretePrototype2 del UML del patron Prototype.

public class Rectangulo implements Figura {
    private final int ancho, alto;
    private final String color;

    public Rectangulo(int ancho, int alto, String color) {
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }

    @Override
    public Figura clonar() {
        return new Rectangulo(ancho, alto, color);
    }

    @Override
    public void mostrar() {
        System.out.println("Rectángulo de " + ancho + "x" + alto + " con color " + color);
    }
}
