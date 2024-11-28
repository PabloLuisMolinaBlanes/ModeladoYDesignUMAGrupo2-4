import java.util.Date;

public class Adopcion {
    private Date fecha;
    private Animal animal;
    private Adoptante adoptante;
    private Socio socio;

    public Adopcion(Date fecha, Animal animal, Adoptante adoptante, Socio socio) {
        this.setFecha(fecha);
        this.setAnimal(animal);
        this.setAdoptante(adoptante);
        this.animal.setAdopcion(this);
        this.socio.tramitarAdopcion(animal, adoptante);
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public Voluntario getTramiteAdopcion() {
    	return this.socio;
    }
    
    public void setTramiteAdopcion(Voluntario voluntario) {
    	this.socio.tramitarAdopcion(this.animal, getAdoptante());
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Adoptante getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(Adoptante adoptante) {
        this.adoptante = adoptante;
    }
}
