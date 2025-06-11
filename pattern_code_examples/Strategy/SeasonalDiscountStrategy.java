// SeasonalDiscountStrategy.java (ConcreteStrategy 4)
public class SeasonalDiscountStrategy implements DiscountStrategy {
    private double seasonalDiscount;

    public SeasonalDiscountStrategy(double seasonalDiscount) {
        this.seasonalDiscount = seasonalDiscount;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount - seasonalDiscount;
    }
}
