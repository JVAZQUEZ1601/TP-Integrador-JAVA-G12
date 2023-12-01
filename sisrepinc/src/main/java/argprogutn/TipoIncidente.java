package argprogutn;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Set;

@Data
@Entity
@Table(name = "tipoincidente")
public class TipoIncidente {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
    private int idTipoIncidente;
    @Column(name = "tipoincidente")
    private String tipoIncidente;
    @Column(name = "tiempomaximoresolucion")
    private Time tiempoMaximoResolucion;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtipoincidente", referencedColumnName = "id")
    private Set<Especialidad> especialidades;

    public TipoIncidente(String tipoIncidente, Time tiempoMaximoResolucion) {
        this.tipoIncidente = tipoIncidente;
        this.tiempoMaximoResolucion = tiempoMaximoResolucion;
    }

    public boolean agregarEspecialidad(Especialidad especialidad) {
        return this.especialidades.add(especialidad);
    }
}
