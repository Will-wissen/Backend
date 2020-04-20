package w3d.database.entitys;


import w3d.database.enums.UserType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(
        name = "Benutzer"
)
public class Benutzer {

    @Id
    private String bname;

    @NotNull
    private UserType userType;

    @NotNull
    private String pw;

    public Benutzer(String bname, UserType utype, String pw){
        this.bname = bname;
        this.userType = utype;
        this.pw = pw;

    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
