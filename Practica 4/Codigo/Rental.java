import java.util.Date;

public abstract class Rental {

	Customer customer;
	RentalOffice pickupOffice;
	private Date startDate;
	private Date endDate;
	private Car car;
	private Discount discount;


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
		if (!car.getRentalOffice().getAddress().equals(pickupOffice.getAddress())) {
			throw new RuntimeException("La oficina de recogida de un coche de alquiler tiene que ser la misma que la oficina donde está asignado el coche de alquiler.");
		}
		this.pickupOffice = pickupOffice;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		if (this.endDate != null && startDate.after(this.endDate)) {
			throw new RuntimeException("Fecha de inicio detectada después de fecha de fin");
		}
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		if (this.startDate != null && endDate.before(this.startDate)) {
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
		return discount.applyDiscount(car.getModel().getPricePerDay() * (int)(endDate.getDay() - startDate.getDay()));
	}
}