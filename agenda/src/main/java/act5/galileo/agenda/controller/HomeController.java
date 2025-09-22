package act5.galileo.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("nombre", "Ondina Victoria Hernandez Jacinto");
        model.addAttribute("carnet", "20010878");
        return "index";
    }
}
