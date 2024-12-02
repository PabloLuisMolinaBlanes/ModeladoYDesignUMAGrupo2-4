package ApartadoA.refugio.socios;

import ApartadoA.refugio.acciones.Donacion;
import ApartadoA.refugio.staff.Refugio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Donante extends Socio {
    List<Donacion> donaciones;

    public Donante(Date registro, Refugio refugio) {
        super(registro, refugio);
        donaciones = new ArrayList<>();
    }

    public void donar(Float cantidad) {
        Donacion donacion = new Donacion(cantidad, new Date());
        donaciones.add(donacion);
        this.getRefugio().recibirDonacion(donacion.getCantidad());
    }

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(List<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

}
