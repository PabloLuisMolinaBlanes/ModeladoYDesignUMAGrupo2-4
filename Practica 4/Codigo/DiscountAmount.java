public class DiscountAmount implements Discount {

    int amount;

    public DiscountAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int applyDiscount(int base) {
        return base - amount;
    }
}
