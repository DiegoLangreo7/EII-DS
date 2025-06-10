// Representa el decorador concreto Pantalones que extiende de ArmaduraDecorator.
public class Pantalones extends ArmaduraDecorator {
    public Pantalones(Criatura componente) {
        super(componente);
    }

    @Override
    public void recibirAtaque(Zona zona, int daño) {
        if (zona == Zona.PIERNAS) {
            System.out.println("👖 Pantalones absorbieron el daño en las piernas.");
        } else {
            componente.recibirAtaque(zona, daño);
        }
    }
}
