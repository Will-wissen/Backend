package w3d.database.entitys;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    private int szvn;

    @NotNull
    private String vname;

    @NotNull
    private String nname;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "Identifikation",cascade = CascadeType.ALL)
    private List<Identifikation> identifikationsMuster;

    public Person(){}

    public Person(int szvn, String vorname, String nachname){
        this.szvn = szvn;
        this.vname = vorname;
        this.nname = nachname;
    }

    public int getSzvn() {
        return szvn;
    }

    public void setSzvn(int szvn) {
        this.szvn = szvn;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public List<Identifikation> getIdentifikationsMuster() {
        return identifikationsMuster;
    }

    public void setIdentifikationsMuster(List<Identifikation> identifikationsMuster) {
        this.identifikationsMuster = identifikationsMuster;
    }
}
