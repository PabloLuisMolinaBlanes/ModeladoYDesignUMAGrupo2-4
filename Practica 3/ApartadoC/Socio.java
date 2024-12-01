package ApartadoD;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Socio implements Voluntario, Donante, Adoptante {
    private Date registro;
    private Refugio refugio;
    private Set<Class<?>> roles = new HashSet<>();

    public Socio(Date registro, Refugio refugio) {
        this.registro = registro;
        this.refugio = refugio;
    }

    // Método para agregar roles al socio
    public void addRole(Class<?> roleType) {
        roles.add(roleType);
    }

    @Override
    public void tramitarAdopcion(Animal a, Adoptante ad) {
        if (!roles.contains(Voluntario.class)) {
            throw new RuntimeException("El socio no tiene el rol de voluntario");
        }
        Adopcion adopcion = new Adopcion(new Date(), a, ad, this);
        this.refugio.getAnimalesRefugiados().remove(a);
        a.setAdopcion(adopcion);
        a.setEstado(EstadoAnimal.adoptado);
        adopciones.add(adopcion);
    }

    @Override
    public void registrar(Animal a) {
        if (!roles.contains(Voluntario.class)) {
            throw new RuntimeException("El socio no tiene el rol de voluntario");
        }
        this.refugio.registrar(a);
    }

    @Override
    public void donar(Float c) {
        if (!roles.contains(Donante.class)) {
            throw new RuntimeException("El socio no tiene el rol de donante");
        }
        Donacion d = new Donacion(c, new Date());
        donaciones.add(d);
        Refugio refu = this.refugio;
        refu.setLiquidez(refu.getLiquidez() + d.getCantidad());
    }

    @Override
    public void adoptar(Animal a, Voluntario v) {
        if (!roles.contains(Adoptante.class)) {
            throw new RuntimeException("El socio no tiene el rol de adoptante");
        }
        v.tramitarAdopcion(a, this);
    }

    // Getter del registro
    public Date getRegistro() {
        return registro;
    }
    public void setRegistro(Date registro) {
        this.registro = registro;
    }
    public Refugio getRefugio() {
        return refugio;
    }
    public void setRefugio(Refugio refugio) {
        this.refugio = refugio;
    }
}
