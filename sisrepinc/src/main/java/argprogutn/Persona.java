package argprogutn;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int idPersona;
    @Enumerated(value = EnumType.STRING)
    private TipoPersona tipoPersona;
    @Column(name = "cuitcuil")
    private String cuitCuil;
    @Column(name = "email")
    private String email;
    @Column(name = "telefono")
    private String telefono;

    public Persona() {}

    public Persona(String cuitCuil, String email, String telefono) {
        this.cuitCuil = cuitCuil;
        this.email = email;
        this.telefono = telefono;
    }
}
