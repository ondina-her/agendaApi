package act5.galileo.agenda.model;            
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

import lombok.Data;

@Entity
@Table(name="Contacto")
@Data
public class Contacto {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String telefono;
    

}