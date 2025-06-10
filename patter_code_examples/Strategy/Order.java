public class Order {
    private double totalAmount;
    private DiscountStrategy discountStrategy;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
        // Por defecto sin descuento
        this.discountStrategy = new NoDiscountStrategy();
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalPrice() {
        return discountStrategy.applyDiscount(totalAmount);
    }
}
