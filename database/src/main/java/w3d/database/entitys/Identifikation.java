package w3d.database.entitys;

import w3d.database.enums.Identification;

import javax.persistence.*;


@Entity
@Table(
        name = "Identifikation"
)
public class Identifikation {
    @Id
    private Identification typ;

    @Id
    private String value;

    public Identifikation(Identification type, String value){
        this.typ = type;
        this.value = value;

    }

    public Identification getTyp() {
        return typ;
    }

    public void setTyp(Identification typ) {
        this.typ = typ;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
