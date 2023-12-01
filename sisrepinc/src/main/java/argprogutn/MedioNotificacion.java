package argprogutn;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "medionotificacion")
public enum MedioNotificacion {
    EMAIL,
    WHATSAPP
}
