import java.util.ArrayList;
import java.util.List;

public class Model {

	private String name;
	private int pricePerDay;
	private List<Car> cars;

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

	public List<Car> getCars() {
		return this.cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

}