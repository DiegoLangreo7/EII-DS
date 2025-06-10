public class Main {
    public static void main(String[] args) {
        Order order = new Order(100.0);

        // Sin descuento
        System.out.println("Precio sin descuento: " + order.calculateFinalPrice());

        // Descuento del 10%
        order.setDiscountStrategy(new PercentageDiscountStrategy(10));
        System.out.println("Precio con 10% descuento: " + order.calculateFinalPrice());

        // Descuento por cantidad (simulando que totalAmount es cantidad)
        order = new Order(15);  // 15 unidades
        order.setDiscountStrategy(new QuantityDiscountStrategy(10, 5));
        System.out.println("Precio con descuento por cantidad (15 unidades): " + order.calculateFinalPrice());

        // Descuento especial de temporada de 7.5
        order = new Order(100);
        order.setDiscountStrategy(new SeasonalDiscountStrategy(7.5));
        System.out.println("Precio con descuento de temporada: " + order.calculateFinalPrice());
    }
}
