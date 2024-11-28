import java.util.Date;
import java.util.ArrayList;

public interface Voluntario {

    public void tramitarAdopcion(Animal a, Adoptante ad);

    public void registrar(Animal a, Refugio r);
}
