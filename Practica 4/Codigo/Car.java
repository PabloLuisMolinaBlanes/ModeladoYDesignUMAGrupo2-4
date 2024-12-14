import java.util.*;

public class Car {

	private String licensePlate;
	private Model model;
	private Date backToService;
	private boolean esSustituto;
	private State estadoActual;
	
	private RentalOffice rentalOffice;
	private ArrayList<Rental> rentals;

	public Car(String licensePlate) {
		this.licensePlate = licensePlate;
		this.esSustituto = false;
		estadoActual = new EnServicio(this);
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
	
	public void setEstadoActual(State actual) {
		this.estadoActual = actual;
	}
	
	public State getEstadoActual() {
		return this.estadoActual;
	}
	
	public boolean getEsSustituto() {
		return this.esSustituto;
	}
	
	public void setEsSustituto(boolean nuevoEstado) {
		this.esSustituto=nuevoEstado;
	}

	public void takeOutOfService(Date backToService) {
		if (esSustituto)
			return;
		estadoActual.takeOutOfService(backToService);
	}
	public void setBackToService(Date backToService) {
		this.backToService = backToService;
	}
}