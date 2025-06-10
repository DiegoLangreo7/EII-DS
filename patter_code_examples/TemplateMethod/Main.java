public class Main {
    public static void main(String[] args) {
        HotDrink tea = new Tea();
        HotDrink coffee = new Coffee();

        System.out.println("Preparando té...");
        tea.prepareRecipe();

        System.out.println("\nPreparando café...");
        coffee.prepareRecipe();
    }
}
