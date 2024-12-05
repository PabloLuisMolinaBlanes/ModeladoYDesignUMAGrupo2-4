public class Car {

	private String licensePlate;
	private Model model;

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
}