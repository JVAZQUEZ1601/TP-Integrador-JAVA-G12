package argprogutn;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "personafisica")
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonaFisica extends Persona {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int idPersonaFisica;
    @Enumerated(value = EnumType.STRING)
    private TipoDocumento tipoDocumento;
    @Column(name = "nrodocumento")
    private String nroDocumento;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fechanacimiento")
    private Date fechaNacimiento;

    public PersonaFisica() {}

    public PersonaFisica(String cuitCuil, String email, String telefono, TipoDocumento tipoDocumento, String nroDocumento, String nombre, String apellido, Date fechaNacimiento) {
        super(cuitCuil, email, telefono);
        super.setTipoPersona(TipoPersona.FISICA);
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
}
