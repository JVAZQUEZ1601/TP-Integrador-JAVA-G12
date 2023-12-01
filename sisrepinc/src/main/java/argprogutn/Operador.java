package argprogutn;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "operador")
@Inheritance(strategy = InheritanceType.JOINED)
public class Operador extends PersonaFisica {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
    private int idOperador;
    @ManyToOne
    @JoinColumn(name = "idarea", referencedColumnName = "id")
    private Area area;

    public Operador(String cuitCuil, String email, String telefono, TipoDocumento tipoDocumento, String nroDocumento, String nombre, String apellido, Date fechaNacimiento, Area area) {
        super(cuitCuil, email, telefono, tipoDocumento, nroDocumento, nombre, apellido, fechaNacimiento);
        this.area = area;
    }
}
