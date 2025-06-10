// DispensingState.java (ConcreteStateC)
public class DispensingState implements State {
    
    private final VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Por favor espere, estamos dispensando el producto.");
    }

    @Override
    public void pressButton() {
        System.out.println("Producto ya está siendo dispensado.");
    }

    @Override
    public void dispense() {
        System.out.println("Producto entregado. Gracias por su compra!");
        machine.setState(machine.getIdleState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("No puede devolver la moneda ahora.");
    }
}
