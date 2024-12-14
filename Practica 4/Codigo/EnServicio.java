import java.util.*;

public class EnServicio implements State{
	
	private Car coche;
	
	public EnServicio(Car carro) {
		this.coche = carro;
	}
	
	@Override
	public void takeOutOfService(Date backToService) {
		
		coche.setEstadoActual(new FueraServicio(coche));
		
		coche.setBackToService(backToService);
		
		String modelo = coche.getModel().getName();
		ArrayList<Car> coches = coche.getRentalOffice().getCars();
		boolean found= false;
		for(int i = 0; i<coches.size() && !found; i++) {
			
			Car cocheActual = coches.get(i);
			
			if(cocheActual.getModel().getName().equals(modelo) &&
					(cocheActual.getEstadoActual() instanceof EnServicio)  &&
					cocheActual.getEsSustituto() == false) {
				found = true;
				cocheActual.setEsSustituto(true);
			}		
		}
	}
}
