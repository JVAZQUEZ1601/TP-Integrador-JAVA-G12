package argprogutn;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tipodocumento")
public enum TipoDocumento {
    DNI,
    LE,
    LC,
    CI,
    PAS
}
