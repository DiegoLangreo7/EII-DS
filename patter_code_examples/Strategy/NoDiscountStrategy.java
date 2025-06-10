// NoDiscountStrategy.java (ConcreteStrategy 1)
public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount;  // sin descuento
    }
}
