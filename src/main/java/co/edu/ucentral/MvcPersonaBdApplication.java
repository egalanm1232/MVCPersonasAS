package co.edu.ucentral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.edu.ucentral.entities.Persona;
import co.edu.ucentral.repository.PersonaRepository;

@SpringBootApplication
public class MvcPersonaBdApplication implements CommandLineRunner {

    @Autowired
    private PersonaRepository personaRepository;

    public static void main(String[] args) {
        SpringApplication.run(MvcPersonaBdApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Insertar datos de prueba al iniciar la aplicación
        Persona p1 = new Persona();
        p1.setNombre("Juan");
        p1.setApellido("Pérez");
        p1.setEmail("juan@example.com");
        p1.setTelefono("3112233445");

        personaRepository.save(p1);
        System.out.println("Se insertaron personas");
    }
}