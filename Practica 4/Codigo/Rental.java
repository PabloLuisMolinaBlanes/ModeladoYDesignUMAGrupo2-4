import java.util.Date;

public abstract class Rental {

	Customer customer;
	RentalOffice pickupOffice;
	private Date startDate;
	private Date endDate;
	private Car car;

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
		this.pickupOffice = pickupOffice;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Car getCar() {
		return this.car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getPrice(Discount discount) {
		return discount.applyDiscount(car.getModel().getPricePerDay() * (int)(endDate.getDay() - startDate.getDay()));
	}
}