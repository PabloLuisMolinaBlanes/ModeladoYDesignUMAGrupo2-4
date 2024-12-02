package ApartadoD;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DonanteRol implements Donante {

    private Socio socio;
    List<Donacion> donaciones;

    public DonanteRol(Socio socio) {
        setSocio(socio);
        setDonaciones(new ArrayList<>());
    }

    @Override
    public void donar(Float c) {
        Donacion d = new Donacion(c, new Date());
        donaciones.add(d);
        Refugio refugio = getSocio().getRefugio();
        refugio.setLiquidez(refugio.getLiquidez() + d.getCantidad());
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(List<Donacion> donaciones) {
        this.donaciones = donaciones;
    }
}
