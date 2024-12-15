import java.util.Date;

public class WebRental extends Rental {

	private int deliveryTime;
	private RentalOffice deliveryOffice;

	public WebRental(Customer customer, RentalOffice pickupOffice, Date startDate, Car car, int deliveryTime, RentalOffice deliveryOffice) {
		super(customer, pickupOffice, startDate, car);
		setDeliveryTime(deliveryTime);
		setDeliveryOffice(deliveryOffice);
	}

	public int getDeliveryTime() {
		return this.deliveryTime;
	}

	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public RentalOffice getDeliveryOffice() {
		return deliveryOffice;
	}

	public void setDeliveryOffice(RentalOffice deliveryOffice) {
		if (!deliveryOffice.getAddress().equals(super.pickupOffice.getAddress()) && this.deliveryTime >= 13) {
			throw new RuntimeException("Si la oficina de recogida y de entrega de un alquiler web son diferentes, la hora de entrega del coche de alquiler tiene que ser anterior a las 13 horas.");
		}
		this.deliveryOffice = deliveryOffice;
		this.getCar().setRentalOffice(deliveryOffice);
	}
}