package ApartadoA.refugio.staff;

import ApartadoA.refugio.animales.Animal;
import ApartadoA.refugio.animales.EstadoAnimal;
import ApartadoA.refugio.socios.Socio;

import java.util.ArrayList;

public class Refugio {
    private Float liquidez;
    private ArrayList<Animal> animalesRefugiados;
    private ArrayList<Animal> animalesRegistrados;
    private ArrayList<Socio> sociosRegistrados;

    public Refugio(Float liquidez) {
        this.liquidez = liquidez;
        this.animalesRefugiados = new ArrayList<Animal>();
        this.animalesRegistrados = new ArrayList<Animal>();
        this.sociosRegistrados = new ArrayList<Socio>();
    }

    void registrar(Animal animal) {
        animal.setEstado(EstadoAnimal.disponible);
        this.animalesRefugiados.add(animal);
        this.animalesRegistrados.add(animal);
    }
    
    public Float getLiquidez() {
        return liquidez;
    }
    
    private void setLiquidez(Float liquidez) {
        this.liquidez = liquidez;
    }
    
    public void recibirDonacion(Float cantidad) {
        this.liquidez += cantidad;
    }
    
    public ArrayList<Animal> getAnimalesRefugiados() {
        return animalesRefugiados;
    }
    public ArrayList<Animal> getAnimalesRegistrados() {
        return animalesRegistrados;
    }
    public ArrayList<Socio> getSociosRegistrados() {
        return sociosRegistrados;
    }
}
