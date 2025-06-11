// Representa el decorador concreto Pechera que extiende de ArmaduraDecorator.
public class Pechera extends ArmaduraDecorator {
    public Pechera(Criatura componente) {
        super(componente);
    }

    @Override
    public void recibirAtaque(Zona zona, int daño) {
        if (zona == Zona.TORSO) {
            System.out.println("🛡️ Pechera bloqueó el daño en el torso.");
        } else {
            componente.recibirAtaque(zona, daño);
        }
    }
}
