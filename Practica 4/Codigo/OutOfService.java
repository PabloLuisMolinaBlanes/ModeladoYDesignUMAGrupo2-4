import java.util.*;


public class OutOfService implements State {

	private Car car;
	
	public OutOfService(Car car) {
		this.car = car;
	}

	@Override
	public void takeOutOfService(Date backToService) {
		return;
	}
}
