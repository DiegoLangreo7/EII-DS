// Representa la clase ConcretePrototype1 del UML del patron Prototype.

public class Circulo implements Figura {
    private final int x, y, radio;
    private final String color;

    public Circulo(int x, int y, int radio, String color) {
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.color = color;
    }

    @Override
    public Figura clonar() {
        return new Circulo(x, y, radio, color);
    }

    @Override
    public void mostrar() {
        System.out.println("Círculo en (" + x + ", " + y + ") con radio " + radio + " y color " + color);
    }
}
