import java.util.Date;

public class Car {

	private String licensePlate;
	private Model model;

	private Date backToService;

	public Car(String licensePlate) {
		this.licensePlate = licensePlate;
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