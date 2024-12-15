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
		if (!this.deliveryOffice.getAddress().equals(super.pickupOffice.getAddress()) && this.deliveryTime != null && this.deliveryTime[0] >= 13) {
			throw new RuntimeException("Si la oficina de recogida y de entrega de un alquiler web son diferentes, la hora de entrega del coche de alquiler tiene que ser anterior a las 13 horas.");
		}
		this.deliveryOffice = deliveryOffice;
	}
}