// HasCoinState.java (ConcreteStateB)
public class HasCoinState implements State {

    private final VendingMachine machine;

    public HasCoinState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Ya hay una moneda insertada.");
    }

    @Override
    public void pressButton() {
        System.out.println("Botón presionado. Dispensando producto...");
        machine.setState(machine.getDispensingState());
        machine.dispense();
    }

    @Override
    public void dispense() {
        System.out.println("Primero debe presionar el botón.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Moneda devuelta.");
        machine.setState(machine.getIdleState());
    }
}
