package ApartadoC;

import java.util.Date;
import java.util.ArrayList;

public class Socio implements Voluntario, Donante, Adoptante {
    private Date registro;
    private Refugio refugio;
    private Socio socio;
    private ArrayList<Adopcion> adopciones;
    private ArrayList<Donacion> donaciones;
    public void tramitarAdopcion(Animal a, Adoptante ad) {
        Adopcion adopcion = new Adopcion(new Date(), a, ad, socio);
        adopciones.add(adopcion);   
    }
    
    public void registrar(Animal a, Refugio r) {
        r.registrar(a);
    }
    
    public void donar(Float c) {
        Donacion d = new Donacion(c, new Date());
        donaciones.add(d);
        Refugio refu = this.getRefugio();
        refu.setLiquidez(refu.getLiquidez() + d.getCantidad());
    }
    public void adoptar(Animal a) {
        a.setEstado(EstadoAnimal.adoptado);
    }
    public Socio(Date registro, Refugio refugio) {
        this.setRegistro(registro);
        this.setRefugio(refugio);
        this.setAdopciones(new ArrayList<Adopcion>());
        this.setDonaciones(new ArrayList<Donacion>());
        socio = this;
    }
    
    public Socio(Date registro, Refugio refugio, ArrayList<Adopcion> adopciones) {
        this.setRegistro(registro);
        this.setRefugio(refugio);
        this.setAdopciones(adopciones);
        socio = this;
    }
    
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
    public ArrayList<Adopcion> getAdopciones() {
    	return adopciones;
    }
    
    public void setAdopciones(ArrayList<Adopcion> adopciones) {
    	this.adopciones = adopciones;
    }
    
    public ArrayList<Donacion> getDonaciones() {
    	return donaciones;
    }
    
    public void setDonaciones(ArrayList<Donacion> donaciones) {
    	this.donaciones = donaciones;
    }
}
