// (Client)
public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.pressButton();  // Por favor, inserte una moneda primero.
        machine.insertCoin();   // Moneda insertada.
        machine.insertCoin();   // Ya hay una moneda insertada.
        machine.pressButton();  // Botón presionado. Dispensando producto...
                                // Producto entregado. Gracias por su compra!
        machine.ejectCoin();    // No hay moneda que devolver.
    }
}
