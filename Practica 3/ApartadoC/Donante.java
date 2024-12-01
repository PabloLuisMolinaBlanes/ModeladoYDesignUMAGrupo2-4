package ApartadoD;

import java.util.ArrayList;

public interface Donante {

    ArrayList<Donacion> donaciones = new ArrayList<>();

    void donar(Float cantidad);
}