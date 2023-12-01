package argprogutn;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tipopersona")
public enum TipoPersona {
    FISICA,
    JURIDICA
}
