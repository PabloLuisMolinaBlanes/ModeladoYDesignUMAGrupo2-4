import java.util.*;

public class InService implements State{
	
	private Car car;
	
	public InService(Car car) {
		this.car = car;
	}
	
	@Override
	public void takeOutOfService(Date backToService) {
		
		car.setCurrentState(new OutOfService(car));
		
		car.setBackToService(backToService);
		
		String model = car.getModel().getName();
		List<Car> cars = car.getRentalOffice().getCars();
		boolean found= false;
		for(int i = 0; i<cars.size() && !found; i++) {

			Car currentCar = cars.get(i);
			
			if(currentCar.getModel().getName().equals(model) &&
			  (currentCar.getCurrentState() instanceof InService) &&
			  !currentCar.isSubstitute()) {
				found = true;
				currentCar.setIsSubstitute(true);
			}		
		}
	}
}
