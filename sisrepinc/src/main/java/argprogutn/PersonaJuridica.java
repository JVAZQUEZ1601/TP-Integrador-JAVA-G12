package argprogutn;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "personajuridica")
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonaJuridica extends Persona {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int idPersonaJuridica;
    @Column(name = "razonsocial")
    private String razonSocial;

    public PersonaJuridica() {}

    public PersonaJuridica(String cuitCuil, String email, String telefono, String razonSocial) {
        super(cuitCuil, email, telefono);
        super.setTipoPersona(TipoPersona.JURIDICA);
        this.razonSocial = razonSocial;
    }
}
