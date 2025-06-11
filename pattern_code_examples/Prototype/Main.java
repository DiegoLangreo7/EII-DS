// Clase para probar el funcionamiento del patrón Prototype.

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5, 10, 15, "Rojo");
        Figura rectangulo = new Rectangulo(20, 10, "Azul");

        Client cliente1 = new Client(circulo);
        Client cliente2 = new Client(rectangulo);

        Figura figuraClonada = cliente1.operacion();  // Clona un círculo
        cliente2.operacion();  // Clona un rectángulo

        System.out.println("¿Son la misma estancia? " + (circulo == figuraClonada));
        System.out.println("Esa es la principal diferencia con el patrón singleton");
    }
}
