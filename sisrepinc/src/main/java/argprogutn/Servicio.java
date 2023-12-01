package argprogutn;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
    private int idServicio;
    @Column(name = "servicio")
    private String servicio;
    @Column(name = "descripcion")
    private String descripcion;

    public Servicio(String servicio, String descripcion) {
        this.servicio = servicio;
        this.descripcion = descripcion;
    }
}
