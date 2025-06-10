// Clase absatracta de la que heredaran los decoradores concretos de la armadura.
// Es para recoger el código común de los decoradores y evitar la duplicación.
public abstract class ArmaduraDecorator implements Criatura {
    protected Criatura componente;

    public ArmaduraDecorator(Criatura componente) {
        this.componente = componente;
    }

    @Override
    public int getVida() {
        return componente.getVida();
    }
}
