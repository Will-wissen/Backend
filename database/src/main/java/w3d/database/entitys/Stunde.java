package w3d.database.entitys;


import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "Stunde")
public class Stunde {

    @Id
    private Time azeit;

    @Id
    private Time ezeit;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    private Ort ort;

    private String bezeichnung;

    public Stunde(){}

    public Stunde(Time azeit, Time ezeit, Ort ort, String bezeichnung){
        this.azeit = azeit;
        this.ezeit = ezeit;
        this.ort = ort;
        this.bezeichnung = bezeichnung;
    }

    public Time getAzeit() {
        return azeit;
    }

    public void setAzeit(Time azeit) {
        this.azeit = azeit;
    }

    public Time getEzeit() {
        return ezeit;
    }

    public void setEzeit(Time ezeit) {
        this.ezeit = ezeit;
    }

    public Ort getOrt() {
        return ort;
    }

    public void setOrt(Ort ort) {
        this.ort = ort;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}