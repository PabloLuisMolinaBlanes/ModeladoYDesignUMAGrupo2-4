import java.util.Date;

public class RentalOnSite extends Rental {

	private String comments;

	public RentalOnSite(Customer customer, RentalOffice pickupOffice, Date startDate, Car car) {
		super(customer, pickupOffice, startDate, car);
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}