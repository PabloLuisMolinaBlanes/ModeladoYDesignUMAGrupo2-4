import java.util.*;

public class Car {

	private String licensePlate;
	private Model model;
	private Date backToService;
	private boolean esSustituto;
	private State enServicio;
	private State fueraServicio;
	private State estadoActual;
	
	private RentalOffice rentalOffice;
	private ArrayList<Rental> rentals;

	public Car(String licensePlate) {
		this.licensePlate = licensePlate;
		this.esSustituto = false;
		enServicio = new EnServicio(this);
		fueraServicio = new FueraServicio(this);
		estadoActual = enServicio;
	}
	
	public void setBackToService(Date backToService) {
		this.backToService = backToService;
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
	
	public State getFueraServicio() {
		return this.fueraServicio;
	}
	
	public State getEstadoActual() {
		return this.estadoActual;
	}
	
	public boolean getEsSustituto() {
		return this.esSustituto;
	}
	
	public void setEsSustituto(boolean b) {
		this.esSustituto=b;
	}

	public void takeOutOfService(Date backToService) {
		
		if(esSustituto == false) {
			estadoActual.takeOutOfService(backToService);
		} else {
			fueraServicio.takeOutOfService(backToService);
		}
	
		
	}
}