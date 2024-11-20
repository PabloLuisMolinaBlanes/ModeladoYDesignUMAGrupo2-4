import java.util.Date;

public class Adopcion {
    private Date fecha;
    private Animal animal;
    private Adoptante adoptante;
    private Voluntario voluntario;

    public Adopcion(Date fecha, Animal animal, Adoptante adoptante, Voluntario voluntario) {
        this.setFecha(fecha);
        this.setAnimal(animal);
        this.setAdoptante(adoptante);
        this.animal.setAdopcion(this);
        this.animal.setTramiteAdopcion(voluntario);
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public Voluntario getTramiteAdopcion() {
    	return this.voluntario;
    }
    
    public void setTramiteAdopcion(Voluntario voluntario) {
    	voluntario.tramitarAdopcion(this, getAdoptante());
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
