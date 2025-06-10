// Representa el decorador concreto Botas que extiende de ArmaduraDecorator.
public class Botas extends ArmaduraDecorator {
    public Botas(Criatura componente) {
        super(componente);
    }

    @Override
    public void recibirAtaque(Zona zona, int daño) {
        if (zona == Zona.PIES) {
            System.out.println("🥾 Botas protegieron los pies.");
        } else {
            componente.recibirAtaque(zona, daño);
        }
    }
}
