package ApartadoD;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a new Refugio (Shelter) with initial funds
        Refugio refugio = new Refugio(1000.0f);

        // Create current date
        Date currentDate = new Date();

        Socio socio = new Socio(currentDate, refugio);
        Socio socio2 = new Socio(currentDate, refugio);

        // Asignar roles al socio
        socio.addRole(VoluntarioRol.class, new VoluntarioRol(socio));
        socio.addRole(DonanteRol.class, new DonanteRol(socio));

        socio2.addRole(AdoptanteRol.class, new AdoptanteRol(socio2));

        // Create an Animal
        Animal animal = new Animal(currentDate, EstadoAnimal.disponible);

        // Register the animal in the shelter
        socio.getRole(VoluntarioRol.class).registrar(animal);

        // Make a donation
        socio.getRole(DonanteRol.class).donar(500.0f);

        // Process an adoption
        socio.getRole(VoluntarioRol.class).tramitarAdopcion(animal, socio2.getRole(AdoptanteRol.class));
        System.out.println("Adoption processed successfully!");

        // Check animal's status
        System.out.println("Animal status: " + animal.getEstado());

        // Check shelter's current funds
        System.out.println("Shelter's current funds: $" + refugio.getLiquidez());

        // Print number of registered animals
        System.out.println("Number of registered animals: " + refugio.getAnimalesRegistrados().size());

        try{
            socio.getRole(AdoptanteRol.class).adoptar(animal, socio.getRole(VoluntarioRol.class));
        }catch (Exception e){
            System.out.println("Error processing adoption: " + e.getMessage());
        }
    }
}
