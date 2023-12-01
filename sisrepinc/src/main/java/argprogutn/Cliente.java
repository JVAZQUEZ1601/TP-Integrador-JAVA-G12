package argprogutn;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "cliente")
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente extends PersonaJuridica {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
    private int idCliente;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idcliente", referencedColumnName = "id")
    private Set<Servicio> serviciosContratados;

    public Cliente(String cuitCuil, String email, String telefono, String razonSocial) {
        super(cuitCuil, email, telefono, razonSocial);
    }

    public boolean agregarServicioContratado(Servicio servicio) {
        return this.serviciosContratados.add(servicio);
    }
}
