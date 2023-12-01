package argprogutn;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
    private int idEspecialidad;
    @Column(name = "especialidad")
    private String especialidad;

    public Especialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
