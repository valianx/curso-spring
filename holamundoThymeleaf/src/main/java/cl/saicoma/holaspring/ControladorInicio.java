package cl.saicoma.holaspring;

import cl.saicoma.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControladorInicio {
    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        String mensaje = "Hola mundo con Thymeleaf";
        Persona persona = new Persona();

        persona.setNombre("Mario");
        persona.setApellido("Gutierrez");
        persona.setEmail("mgutiers3012@gmail.com");
        persona.setTelefono("123456789");

        log.info("controlador Spring MVC");

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("persona", persona);
        return "index";
    }

}
