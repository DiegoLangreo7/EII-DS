public class Coffee extends HotDrink {

    @Override
    void brew() {
        System.out.println("Preparando café molido en agua caliente");
    }

    @Override
    void addCondiments() {
        System.out.println("Añadiendo azúcar y leche");
    }
}
