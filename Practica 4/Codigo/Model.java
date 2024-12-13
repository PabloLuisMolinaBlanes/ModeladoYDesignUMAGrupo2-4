import java.util.ArrayList;

public class Model {

	private String name;
	private int pricePerDay;
	private ArrayList<Car> cars;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPricePerDay() {
		return this.pricePerDay;
	}

	public void setPricePerDay(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public ArrayList<Car> getCars() {
		return this.cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

}