package argprogutn;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estadoincidente")
public enum EstadoIncidente {
    INGRESADO,
    RESUELTO
}
