// Representa el decorador concreto Casco que extiende de ArmaduraDecorator.
public class Casco extends ArmaduraDecorator {
    public Casco(Criatura componente) {
        super(componente);
    }

    @Override
    public void recibirAtaque(Zona zona, int daño) {
        if (zona == Zona.CABEZA) {
            System.out.println("🪖 Casco absorbió el daño en la cabeza.");
        } else {
            componente.recibirAtaque(zona, daño);
        }
    }
}
