// Humano.java
public class Humano implements Criatura {
    private int vida;

    public Humano(int vidaInicial) {
        this.vida = vidaInicial;
    }

    @Override
    public void recibirAtaque(Zona zona, int daño) {
        System.out.println("💥 Ataque recibido en " + zona + " por " + daño + " de daño.");
        vida -= daño;
        if(vida <= 0)  
            System.out.println("💀 Humano muerto.");
        else
            System.out.println("😖 Humano herido. Vida restante: " + vida);
    }

    @Override
    public int getVida() {
        return vida;
    }
}
