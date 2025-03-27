
package co.edu.ucentral.controllerPersona;

import co.edu.ucentral.entities.Persona;
import co.edu.ucentral.repository.PersonaRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author lebaqueror
 */
@Controller
@Slf4j
public class PersonaController {
    
    @Autowired
    private PersonaRepository repository;
    
    @GetMapping("/")
    public String index(Model model) {
        ArrayList<Persona> personas = (ArrayList<Persona>) (List<Persona>) repository.findAll(); // SELECT * ...
        model.addAttribute("personas",personas);
        return "index";
    }
}
