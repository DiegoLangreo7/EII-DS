// Interfaz que define tanto al componente concreto como a sus decoradores.
public interface Criatura {
    void recibirAtaque(Zona zona, int daño);
    int getVida();
}
