import java.util.ArrayList;
import java.util.Date;

public class Car {

	private String licensePlate;
	private Model model;
	private RentalOffice rentalOffice;
	private ArrayList<Rental> rentals;

	private Date backToService;

	public Car(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public RentalOffice getRentalOffice() {
		return this.rentalOffice;
	}

	public ArrayList<Rental> getRentals() {
		return this.rentals;
	}

	public void setRentals(ArrayList<Rental> rentals) {
		this.rentals = rentals;
	}

	public void setRentalOffice(RentalOffice rentalOffice) {
		this.rentalOffice = rentalOffice;
	}

	public String getLicensePlate() {
		return this.licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public void takeOutOfService(Date backToService) {
		if (this.backToService == null)
			return;
		this.backToService = backToService;
		
	}
}
