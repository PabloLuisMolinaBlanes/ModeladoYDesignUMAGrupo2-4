import ApartadoC.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a new Refugio (Shelter) with initial funds
        Refugio refugio = new Refugio(1000.0f);

        // Create current date
        Date currentDate = new Date();

        // Create a Voluntario (Volunteer)
        Socio socio = new Socio(currentDate, refugio);

        // Create an Animal
        Animal animal = new Animal(currentDate, EstadoAnimal.disponible);

        // Register the animal in the shelter
        socio.registrar(animal, refugio);

        // Make a donation
        socio.donar(500.0f);

        // Process an adoption
        try {
            socio.tramitarAdopcion(animal, socio);
            System.out.println("Adoption processed successfully!");

            // Check animal's status
            System.out.println("Animal status: " + animal.getEstado());

            // Check shelter's current funds
            System.out.println("Shelter's current funds: $" + refugio.getLiquidez());

            // Print number of registered animals
            System.out.println("Number of registered animals: " +
                    refugio.getAnimalesRegistrados().size());

        } catch (Exception e) {
            System.out.println("Error processing adoption: " + e.getMessage());
        }
    }
}
