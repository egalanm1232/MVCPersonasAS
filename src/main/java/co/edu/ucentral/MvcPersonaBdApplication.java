package co.edu.ucentral;

import co.edu.ucentral.entities.Persona;
import co.edu.ucentral.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcPersonaBdApplication implements CommandLineRunner {

    @Autowired
    private PersonaRepository personaRepository;

    public static void main(String[] args) {
        SpringApplication.run(MvcPersonaBdApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Insertar datos directamente al iniciar la app
        Persona p1 = new Persona();
        p1.setNombre("Juan");
        p1.setApellido("Pérez");
        p1.setEmail("juan@example.com");
        p1.setTelefono("3112233445");

        Persona p2 = new Persona();
        p2.setNombre("María");
        p2.setApellido("Gómez");
        p2.setEmail("maria@example.com");
        p2.setTelefono("3223344556");

        personaRepository.save(p1);
        personaRepository.save(p2);

        System.out.println("✔ Personas insertadas correctamente desde MvcPersonaBdApplication.");
    }
}
