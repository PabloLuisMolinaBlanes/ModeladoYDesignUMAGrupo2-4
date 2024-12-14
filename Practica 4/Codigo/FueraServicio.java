import java.util.*;


public class FueraServicio implements State {

	private Car coche;
	
	public FueraServicio(Car carro) {
		this.coche = carro;
	}
	
	
	@Override
	public void takeOutOfService(Date backToService) {
		
		return;
		
	}
}
