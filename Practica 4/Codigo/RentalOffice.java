import java.util.ArrayList;

public class RentalOffice {

	private String address;
	private int feeForDelivery;
	private ArrayList<Car> cars;
	private ArrayList<Rental> rentals;
	private ArrayList<WebRental> webRentals;

	public RentalOffice(String address, int feeForDelivery) {
		this.address = address;
		this.feeForDelivery = feeForDelivery;
	}

	public ArrayList<Car> getCars() {
		return this.cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	public ArrayList<Rental> getRentals() {
		return this.rentals;
	}

	public void setRentals(ArrayList<Rental> rentals) {
		this.rentals = rentals;
	}

	public ArrayList<WebRental> getWebRentals() {
		return this.webRentals;
	}

	public void setWebRentals(ArrayList<WebRental> webRentals) {
		this.webRentals = webRentals;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getFeeForDelivery() {
		return this.feeForDelivery;
	}

	public void setFeeForDelivery(int feeForDelivery) {
		this.feeForDelivery = feeForDelivery;
	}

}