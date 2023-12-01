package argprogutn;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

@Data
@Entity
@Table(name = "incidente")
public class Incidente {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
    private int idIncidente;
    @ManyToOne
    @JoinColumn(name = "idtipoincidente", referencedColumnName = "id")
    private TipoIncidente tipoIncidente;
    @ManyToOne
    @JoinColumn(name = "idespecialidad", referencedColumnName = "id")
    private Especialidad especialidad;
    @ManyToOne
    @JoinColumn(name = "idaplicacion", referencedColumnName = "id")
    private Aplicacion aplicacion;
    @ManyToOne
    @JoinColumn(name = "idsistemaoperativo", referencedColumnName = "id")
    private SistemaOperativo sistemaOperativo;
    @ManyToOne
    @JoinColumn(name = "idservicio", referencedColumnName = "id")
    private Servicio servicio;
    @ManyToOne
    @JoinColumn(name = "idoperador", referencedColumnName = "id")
    private Operador operador;
    @ManyToOne
    @JoinColumn(name = "idcliente", referencedColumnName = "id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "idtecnico", referencedColumnName = "id")
    private Tecnico tecnico;
    @Enumerated(value = EnumType.STRING)
    private EstadoIncidente estado;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "tiempoestimadoresolucion")
    private Time tiempoEstimadoResolucion;
    @Column(name = "colchontiempoestimadoresolucion")
    private Time colchonTiempoEstimadoResolucion;
    @Column(name = "tiemporesolucion")
    private Time tiempoResolucion;
    @Column(name = "fechaingreso")
    private Date fechaIngreso;
    @Column(name = "fechaestimadaresolucion")
    private Date fechaEstimadaResolucion;
    @Column(name = "fecharesolucion")
    private Date fechaResolucion;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idincidentepadre", referencedColumnName = "id")
    private Set<Incidente> incidentes;

    public Incidente(Operador operador, TipoIncidente tipoIncidente, Servicio servicio, Cliente cliente, String descripcion) {
        this.tipoIncidente = tipoIncidente;
        this.servicio = servicio;
        this.cliente = cliente;
        this.descripcion = descripcion;
    }
}
