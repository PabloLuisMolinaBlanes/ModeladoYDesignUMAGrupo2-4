package ApartadoD;

public class AdoptanteRol implements Adoptante {

    private Socio socio;

    public AdoptanteRol(Socio socio) {
        setSocio(socio);
    }

    @Override
    public void adoptar(Animal a, Voluntario v) {
        v.tramitarAdopcion(a, this);
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
}
