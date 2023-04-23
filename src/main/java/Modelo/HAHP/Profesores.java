package Modelo.HAHP;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Profesores implements Serializable {
    public static final Long serialVersionUID = 1L;
    private int idprof;
    private Nombrecom nombre;
    private String materiaesp;
    private String direc;
    private LocalDate fechanam;
    private String telef, celu, email,lugarest;
    private int idecont,idetipoest;

    public Profesores(){}

    public Profesores(int idprof, String nombre, String paterno, String materno, String idcont, String materiaesp, String direc, String telef, String celu, String idetipoest, String email, Date fechaNam, String lugar){
    }
    public Profesores(int idprof,int idecont,int idetipoest, LocalDate fechanam){
        this.idprof = idprof;
        this.idecont= idecont;
        this.idetipoest= idetipoest;
        this.fechanam = fechanam;
    }
    public Profesores (Nombrecom nombre,String materiaesp,String direc,String telef,
    String celu, String email){
        this.nombre = nombre;
        this.materiaesp = materiaesp;
        this.direc = direc;
        this.telef = telef;
        this.celu= celu;
        this.email = email;
    }
    public Profesores(String lugarest){this.lugarest = lugarest;}
    public int getIdprof() {return idprof;}
    public void setIdprof(int idprof) {
        this.idprof = idprof;
    }
    public int getIdecont() {return idecont;}
    public void setIdecont(int idecont) {
        this.idecont = idecont;
    }
    public Nombrecom getNombre() {return nombre;}
    public void setNomprof(Nombrecom nombre) {
        this.nombre = nombre;
    }
    public String getMateriaesp() {return materiaesp;}
    public void setMateriaesp(String materiaesp) {
        this.materiaesp = materiaesp;
    }

    public LocalDate getFechanam() {
        return fechanam;
    }
    public void setFechanam(LocalDate fechanam) {
        this.fechanam = fechanam;
    }

    public String getDirec() {return direc;}
    public void setDirec(String direc) {
        this.direc = direc;
    }
    public String getTelef() {return telef;}
    public void setTelef(String telef) {
        this.telef = telef;
    }
    public String getCelu() {return celu;}
    public void setCelu(String celu) {
        this.celu = celu;
    }
    public String getEmail() {return email;}
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdetipoest() {return idetipoest;}
    public void setIdetipoest(int idetipoest) {
        this.idetipoest = idetipoest;
    }
}
