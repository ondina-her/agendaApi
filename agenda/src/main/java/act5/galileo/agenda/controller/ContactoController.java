package act5.galileo.agenda.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import act5.galileo.agenda.service.ContactoService;
import act5.galileo.agenda.model.Contacto;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1/contacto")
public class ContactoController {
    private  ContactoService contactoService;
    ContactoController(ContactoService contactoService) {
        this.contactoService = contactoService;
    }
    @GetMapping
    public List<Contacto> getAll() {
        return contactoService.list();
    }
    @PostMapping
    public Contacto create(@RequestBody(required = true) Contacto contacto) {
        return contactoService.add(contacto);
    }
}
