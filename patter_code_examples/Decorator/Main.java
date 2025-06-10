// Main.java
public class Main {
    public static void main(String[] args) {
        
        // Creamos al primer sujeto de pruebas, todo un valiente.
        Criatura humanoValiente = new Humano(100);

        // Le hacemos un ataque en la cabeza.
        humanoValiente.recibirAtaque(Zona.CABEZA, 20); 
        // Ya no es tan valiente, se pone casco.
        Criatura humanoConCasco = humanoValiente = new Casco(humanoValiente);
        // Le hacemos otro ataque mortal en el cuerpo.
        humanoConCasco.recibirAtaque(Zona.TORSO, 80); 

        System.out.println("❤️ Vida final: " + humanoValiente.getVida());



        Criatura humanoPrecavido = new Humano(100);
        // Le colocamos toda la armadura.
        Criatura humanoBlindado = new Casco(
                             new Pechera(
                                 new Pantalones(
                                     new Botas(humanoPrecavido))));

        // Pruebas de ataques en diferentes zonas.
        humanoBlindado.recibirAtaque(Zona.CABEZA, 30);  // Bloqueado
        humanoBlindado.recibirAtaque(Zona.TORSO, 20);   // Bloqueado
        humanoBlindado.recibirAtaque(Zona.PIERNAS, 15); // Bloqueado
        humanoBlindado.recibirAtaque(Zona.PIES, 10);    // Bloqueado

        System.out.println("❤️ Vida final: " + humanoPrecavido.getVida());
    }
}
