package ApartadoA.refugio.staff;

import ApartadoA.refugio.animales.Animal;
import ApartadoA.refugio.animales.EstadoAnimal;
import ApartadoA.refugio.acciones.Adopcion;
import ApartadoA.refugio.socios.Adoptante;
import ApartadoA.refugio.socios.Socio;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Voluntario extends Socio {

    private List<Adopcion> adopciones;

    public Voluntario(Date registro, Refugio refugio) {
        super(registro,refugio);
        this.adopciones = new ArrayList<>();
    }

    public void tramitarAdopcion(Animal animal, Adoptante adoptante) {
        Adopcion adopcion = new Adopcion(new Date(), animal, adoptante, this);
        this.getRefugio().getAnimalesRefugiados().remove(animal);
        animal.setAdopcion(adopcion);
        animal.setEstado(EstadoAnimal.adoptado);
        adopciones.add(adopcion);
    }

    public void registrar(Animal a) {
        getRefugio().registrar(a);
    }

    public List<Adopcion> getAdopciones() {
        return adopciones;
    }

    public void setAdopciones(List<Adopcion> adopciones) {
        this.adopciones = adopciones;
    }
}
