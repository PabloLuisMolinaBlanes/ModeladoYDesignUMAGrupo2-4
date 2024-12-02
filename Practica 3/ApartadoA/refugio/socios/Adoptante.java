package ApartadoA.refugio.socios;

import ApartadoA.refugio.animales.Animal;
import ApartadoA.refugio.staff.Refugio;
import ApartadoA.refugio.staff.Voluntario;

import java.util.Date;
public class Adoptante extends Socio {

    public Adoptante(Date registro, Refugio refu) {
        super(registro,refu);
    }

    public void adoptar(Animal animal, Voluntario voluntario) {
        voluntario.tramitarAdopcion(animal, this);
    }
}
