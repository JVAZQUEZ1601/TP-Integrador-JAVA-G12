package argprogutn;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sistemaoperativo")
public class SistemaOperativo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
    private int idSistemaOperativo;
    @Column(name = "sistemaoperativo")
    private String sistemaOperativo;

    public SistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}
