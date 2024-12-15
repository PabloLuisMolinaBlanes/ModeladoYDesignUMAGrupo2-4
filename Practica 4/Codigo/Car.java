import java.util.*;

public class Car {

	private String licensePlate;
	private Model model;
	private Date backToService;
	private boolean isSubstitute;
	private State currentState;
	
	private RentalOffice rentalOffice;
	private List<Rental> rentals;

	public Car(String licensePlate, Model model) {
		setLicensePlate(licensePlate);
		setModel(model);
		setIsSubstitute(false);
		setCurrentState(new InService(this));
	}
	
	public RentalOffice getRentalOffice() {
		return this.rentalOffice;
	}

	public List<Rental> getRentals() {
		return this.rentals;
	}

	public void setRentals(List<Rental> rentals) {
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
	
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public State getCurrentState() {
		return this.currentState;
	}
	
	public boolean isSubstitute() {
		return this.isSubstitute;
	}
	
	public void setIsSubstitute(boolean isSubstitute) {
		this.isSubstitute = isSubstitute;
	}

	public void takeOutOfService(Date backToService) {
		if (isSubstitute)
			return;
		currentState.takeOutOfService(backToService);
	}
	public void setBackToService(Date backToService) {
		this.backToService = backToService;
	}
}