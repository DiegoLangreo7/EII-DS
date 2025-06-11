// QuantityDiscountStrategy.java (ConcreteStrategy 3)
public class QuantityDiscountStrategy implements DiscountStrategy {
    private int minQuantity;
    private double discountAmount;

    public QuantityDiscountStrategy(int minQuantity, double discountAmount) {
        this.minQuantity = minQuantity;
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        // Para simplificar, si el totalAmount representa cantidad > minQuantity aplica descuento fijo
        // En la vida real, el totalAmount suele ser precio, pero aquí simulamos con cantidad.
        if (totalAmount > minQuantity) {
            return totalAmount - discountAmount;
        }
        return totalAmount;
    }
}
