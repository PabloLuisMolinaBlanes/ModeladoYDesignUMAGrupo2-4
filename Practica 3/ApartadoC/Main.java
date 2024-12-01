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
        socio.addRole(Voluntario.class);
        socio.addRole(Donante.class);

        socio2.addRole(Adoptante.class);

        // Create an Animal
        Animal animal = new Animal(currentDate, EstadoAnimal.disponible);

        // Register the animal in the shelter
        socio.registrar(animal);

        // Make a donation
        socio.donar(500.0f);

        // Process an adoption

        socio.tramitarAdopcion(animal, socio2);
        System.out.println("Adoption processed successfully!");

        // Check animal's status
        System.out.println("Animal status: " + animal.getEstado());

        // Check shelter's current funds
        System.out.println("Shelter's current funds: $" + refugio.getLiquidez());

        // Print number of registered animals
        System.out.println("Number of registered animals: " + refugio.getAnimalesRegistrados().size());

        //Socio no tiene el rol de adoptante
        try {
            socio.adoptar(animal, socio);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        //Socio2 no tiene el rol de voluntario
        try {
            socio2.tramitarAdopcion(animal, socio);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
