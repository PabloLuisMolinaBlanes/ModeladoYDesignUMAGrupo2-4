import java.util.Date;
public class Adoptante extends Socio {
    public Adoptante(Date registro,Refugio refu) {
        super(registro,refu);
    }
    /**
	 * 
	 * @param a
	 */
    public void adoptar(Animal animal, Voluntario voluntario) {
        voluntario.tramitarAdopcion(animal, this);
    }
}
