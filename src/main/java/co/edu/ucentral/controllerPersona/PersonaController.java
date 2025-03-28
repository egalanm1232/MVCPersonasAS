package co.edu.ucentral.controllerPersona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.edu.ucentral.entities.Persona;
import co.edu.ucentral.repository.PersonaRepository;

@Controller
public class PersonaController {

    @Autowired
    private PersonaRepository repository;

    @GetMapping("/")
    public String index(Model model) {
        List<Persona> personas = repository.findAll();
        model.addAttribute("personas", personas);
        return "index"; // Se carga index.html desde templates
    }
}