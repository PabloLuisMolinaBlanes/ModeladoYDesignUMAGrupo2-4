import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RentalCollection implements Collection {

    Collection<Rental> rentals;

    public RentalCollection() {
        this.rentals = new ArrayList<>();
    }

    @Override
    public int size() {
        return rentals.size();
    }

    @Override
    public boolean isEmpty() {
        return rentals.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return rentals.contains(o);
    }

    @Override
    public Iterator iterator() {
        return new RentalIterator(rentals);
    }

    @Override
    public Object[] toArray() {
        return rentals.toArray();
    }

    @Override
    public boolean add(Object o) {
        Iterator iterator = this.iterator();
        Rental rental = (Rental) o;
        while (iterator.hasNext()) {
            Rental rental2 = (Rental) iterator.next();
            if (rental2.getStartDate().before(rental.getStartDate()) && rental2.getEndDate().after(rental.getEndDate())) {
                throw new RuntimeException("Los alquileres no pueden solaparse");
            }
        }
        return rentals.add((Rental) o);
    }

    @Override
    public boolean remove(Object o) {
        return rentals.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        return rentals.addAll(c);
    }

    @Override
    public void clear() {
        rentals.clear();
    }

    @Override
    public boolean retainAll(Collection c) {
        return rentals.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return rentals.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return rentals.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return rentals.toArray(a);
    }
}
