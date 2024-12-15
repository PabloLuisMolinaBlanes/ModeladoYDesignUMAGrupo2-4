import java.util.List;

public class RentalOffice {

	private String address;
	private int feeForDelivery;
	private List<Car> cars;
	private List<Rental> rentals;
	private List<WebRental> webRentals;

	public RentalOffice(String address, int feeForDelivery) {
		this.address = address;
		this.feeForDelivery = feeForDelivery;
	}

	public List<Car> getCars() {
		return this.cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public List<Rental> getRentals() {
		return this.rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}

	public List<WebRental> getWebRentals() {
		return this.webRentals;
	}

	public void setWebRentals(List<WebRental> webRentals) {
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