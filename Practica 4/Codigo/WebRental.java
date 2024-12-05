public class WebRental extends Rental {

	private int[] deliveryTime;
	private RentalOffice deliveryOffice;

	public WebRental() {
		super();
	}

	public int[] getDeliveryTime() {
		return this.deliveryTime;
	}

	public void setDeliveryTime(int[] deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public RentalOffice getDeliveryOffice() {
		return deliveryOffice;
	}

	public void setDeliveryOffice(RentalOffice deliveryOffice) {
		this.deliveryOffice = deliveryOffice;
	}
}