public class DiscountPercents implements Discount{
    float percents;

    public DiscountPercents(float percents) {
        this.percents = percents;
    }

    @Override
    public int applyDiscount(int base) {
        return base - (int)(base*percents);
    }
}
