public class NoDiscount implements Discount{
    @Override
    public int applyDiscount(int base) {
        return base;
    }
}
