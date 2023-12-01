package argprogutn;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "area")
public class Area {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
    private int idArea;
    @Column(name = "area")
    private String area;

    public Area(String area) {
        this.area = area;
    }
}
