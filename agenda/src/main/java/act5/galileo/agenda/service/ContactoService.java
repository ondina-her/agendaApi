package act5.galileo.agenda.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import act5.galileo.agenda.model.Contacto;
import act5.galileo.agenda.model.repository.ContactoRepository;
import java.util.List;
@Service
public class ContactoService {
    @Autowired
    private ContactoRepository contactoRepository;
    public Contacto add(Contacto contacto) {
        return this.contactoRepository.save(contacto);
    }
    public List<Contacto > list() {
        return this.contactoRepository.findAll();
    }
}
