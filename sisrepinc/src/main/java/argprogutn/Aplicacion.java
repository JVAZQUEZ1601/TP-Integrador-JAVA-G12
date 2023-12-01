package argprogutn;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "aplicacion")
public class Aplicacion {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
    private int idAplicacion;
    @Column(name = "aplicacion")
    private String aplicacion;

    public Aplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }
}
