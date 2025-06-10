// Clase abstracta (Template)
public abstract class HotDrink {

    // Método plantilla: define el esqueleto del algoritmo
    public final void prepareRecipe() {
        boilWater();     // hervirAgua
        brew();          // preparar bebida
        pourInCup();     // verter en una Taza
        addCondiments(); // añadir condimentos
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Hirviendo agua");
    }

    void pourInCup() {
        System.out.println("Vertiendo en la taza");
    }
}
