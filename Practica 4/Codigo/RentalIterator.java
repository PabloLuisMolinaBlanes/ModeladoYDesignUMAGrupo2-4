import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RentalIterator implements Iterator {

    Collection<Rental> rentals;
    int currentIndex;

    public RentalIterator(Collection<Rental> rentals) {
        this.rentals = rentals;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < rentals.size();
    }

    @Override
    public Object next() {
        return rentals.toArray()[currentIndex++];
    }
}