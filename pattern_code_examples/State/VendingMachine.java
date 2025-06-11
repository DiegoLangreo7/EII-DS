// VendingMachine.java (Context)
public class VendingMachine {
    
    private final State idleState;
    private final State hasCoinState;
    private final State dispensingState;

    private State currentState;

    public VendingMachine() {
        idleState = new IdleState(this);
        hasCoinState = new HasCoinState(this);
        dispensingState = new DispensingState(this);

        currentState = idleState;  // Estado inicial
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getDispensingState() {
        return dispensingState;
    }

    // Métodos delegados al estado actual

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void pressButton() {
        currentState.pressButton();
    }

    public void dispense() {
        currentState.dispense();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }
}
