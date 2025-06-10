// IdleState.java (ConcreteStateA)
public class IdleState implements State {
    
    private final  VendingMachine machine;

    public IdleState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Moneda insertada.");
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("Por favor, inserte una moneda primero.");
    }

    @Override
    public void dispense() {
        System.out.println("No hay producto para dispensar.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No hay moneda que devolver.");
    }
}
