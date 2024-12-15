public class DiscountPercents implements Discount{
    float percents;

    public DiscountPercents(float percents) {
        //input must be between 0 and 100
        if (percents < 0 || percents > 100) {
            throw new RuntimeException("DiscountPercents: porcentaje de descuento debe estar entre 0 y 100");
        }
        this.percents = percents/100;
    }

    @Override
    public int applyDiscount(int base) {
        return base - (int)(base*percents);
    }
}
