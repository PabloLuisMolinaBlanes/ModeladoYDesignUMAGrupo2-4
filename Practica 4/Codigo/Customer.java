import java.util.*;

public class Customer {

	RentalCollection rentals;
	RentalIterator	rentalIterator;
	private String dni;
	private String name;

	public Customer(String dni, String name) {
		this.dni = dni;
		this.name = name;
		this.rentals = new RentalCollection();
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RentalCollection getRentals() {
		return rentals;
	}

	public void setRentals(RentalCollection rentals) {
		this.rentals = rentals;
	}

	public RentalIterator getRentalIterator() {
		this.rentalIterator = new RentalIterator(this.rentals);
		return this.rentalIterator;
	}

	public int numberOfRentalsWithDifferentOffices(){

		this.rentalIterator = new RentalIterator(this.rentals);
		int count = 0;
		while(this.rentalIterator.hasNext()){
			Rental rental = (Rental) this.rentalIterator.next();
			if (rental.getClass().equals(WebRental.class)){
				WebRental webRental = (WebRental) rental;
				if (webRental.getDeliveryOffice() != webRental.getDeliveryOffice()){
					count++;
				}
			}
		}
		return count;
	}

}