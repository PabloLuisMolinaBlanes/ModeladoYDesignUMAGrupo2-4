import java.util.ArrayList;
import java.util.Date;

public class Donante extends Socio {
    ArrayList<Donacion> donaciones;

    public Donante(Date registro, Refugio refu) {
        super(registro, refu);
        donaciones = new ArrayList<>();
    }
    /**
	 * 
	 * @param c
	 */
    public void donar(Float c) {
        Donacion d = new Donacion(c, new Date());
        donaciones.add(d);
        Refugio refu = this.getRefugio();
        refu.setLiquidez(refu.getLiquidez() + d.getCantidad());
    }
}
