package w3d.database.entitys;


import javax.persistence.*;


@Entity
@Table(name = "Ort")
public class Ort {

    @Id
    private String name;

    private String beschreibung;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "Stunde",cascade = CascadeType.ALL)
    private Stunde stunde;

    public Ort(){}

    public Ort(String name, String beschreibung){
        this.name = name;
        this.beschreibung = beschreibung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Stunde getStunde() {
        return stunde;
    }

    public void setStunde(Stunde stunde) {
        this.stunde = stunde;
    }
}
