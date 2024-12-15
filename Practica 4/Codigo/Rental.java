import java.time.Duration;
import java.util.Date;

public abstract class Rental {

	Customer customer;
	RentalOffice pickupOffice;
	private Date startDate;
	private Date endDate;
	private Car car;
	private Discount discount;

	public Rental(Customer customer, RentalOffice pickupOffice, Date startDate, Car car) {
		setCustomer(customer);
		setCar(car);
		setPickupOffice(pickupOffice);
		setStartDate(startDate);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public RentalOffice getPickupOffice() {
		return pickupOffice;
	}

	public void setPickupOffice(RentalOffice pickupOffice) {
		if (!car.getRentalOffice().equals(pickupOffice)) {
			throw new RuntimeException("La oficina de recogida de un coche de alquiler tiene que ser la misma que la oficina donde está asignado el coche de alquiler.");
		}
		this.pickupOffice = pickupOffice;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		if (getEndDate() != null && startDate.after(this.endDate)) {
			throw new RuntimeException("Fecha de inicio detectada después de fecha de fin");
		}
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		if (getStartDate() != null && endDate.before(this.startDate)) {
			throw new RuntimeException("Fecha de fin detectada antes de fecha de inicio");
		}
		this.endDate = endDate;
	}

	public Car getCar() {
		return this.car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public int getPrice() {
		return getDiscount().applyDiscount(getCar().getModel().getPricePerDay() * (int) Duration.between(startDate.toInstant(), endDate.toInstant()).toDays());
	}
}