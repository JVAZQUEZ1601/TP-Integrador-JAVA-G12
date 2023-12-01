package argprogutn;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


@Data
@Entity
@Table(name = "tecnico")
@Inheritance(strategy = InheritanceType.JOINED)
public class Tecnico extends PersonaFisica {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
    private int idTecnico;
    @Enumerated(value = EnumType.STRING)
    private MedioNotificacion medioNotificacion;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtecnico", referencedColumnName = "id")
    private Map<TipoIncidente, Time> tiposIncidente;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtecnico", referencedColumnName = "id")
    private Set<Especialidad> especialidades;

    public Tecnico(String cuitCuil, String email, String telefono, TipoDocumento tipoDocumento, String nroDocumento, String nombre, String apellido, Date fechaNacimiento, MedioNotificacion medioNotificacion) {
        super(cuitCuil, email, telefono, tipoDocumento, nroDocumento, nombre, apellido, fechaNacimiento);
        this.medioNotificacion = medioNotificacion;
        this.tiposIncidente = new HashMap<>();
    }

    public void agregarTipoIncidente(TipoIncidente tipoIncidente, Time tiempoEstimadoResolucion) {
        this.tiposIncidente.put(tipoIncidente, tiempoEstimadoResolucion);
    }

    public boolean agregarEspecialidad(Especialidad especialidad) {
        return this.especialidades.add(especialidad);
    }
}
