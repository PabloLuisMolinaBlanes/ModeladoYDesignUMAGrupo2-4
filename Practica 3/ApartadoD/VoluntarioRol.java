package ApartadoD;

import java.util.Date;

public class VoluntarioRol implements Voluntario {

    private Socio socio;

    public VoluntarioRol(Socio socio) {
        setSocio(socio);
    }

    @Override
    public void tramitarAdopcion(Animal animal, Adoptante adoptante) {
        Adopcion adopcion = new Adopcion(new Date(), animal, adoptante, this);
        getSocio().getRefugio().getAnimalesRefugiados().remove(animal);
        animal.setAdopcion(adopcion);
        animal.setEstado(EstadoAnimal.adoptado);
        adopciones.add(adopcion);
    }

    @Override
    public void registrar(Animal animal) {
        getSocio().getRefugio().registrar(animal);
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
}
