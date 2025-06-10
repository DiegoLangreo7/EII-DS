// Clase Concreta (implementacion de la plantilla)
public class Tea extends HotDrink {

    @Override
    void brew() {
        System.out.println("Metiendo la bolsa de té en agua caliente");
    }

    @Override
    void addCondiments() {
        System.out.println("Añadiendo limón");
    }
}
