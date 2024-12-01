import java.util.Date;
import java.util.ArrayList;

public class Voluntario extends Socio {
    private ArrayList<Adopcion> adopciones;
	/**
	 * 
	 * @param a
	 * @param ad
	 */
    public Voluntario(Date registro,Refugio refugio) {
        super(registro,refugio);
        this.adopciones = new ArrayList<Adopcion>();
    }

    public void tramitarAdopcion(Animal a, Adoptante ad) {
        Adopcion adopcion = new Adopcion(new Date(), a, ad, this);
        this.getRefugio().getAnimalesRefugiados().remove(a);
        a.setAdopcion(adopcion);
        a.setEstado(EstadoAnimal.adoptado);
        adopciones.add(adopcion);
    }

	/**
	 * 
	 * @param a
	 * @param r
	 */

    public void registrar(Animal a) {
        getRefugio().registrar(a);
    }
}
