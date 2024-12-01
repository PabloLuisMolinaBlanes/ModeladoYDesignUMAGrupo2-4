package ApartadoD;

import java.util.ArrayList;

public interface Voluntario {

    ArrayList<Adopcion> adopciones = new ArrayList<>();
    void tramitarAdopcion(Animal animal, Adoptante adoptante);
    void registrar(Animal animal);
}