package Modelo.HAHP;

import java.io.Serializable;

public class Materia implements Serializable {
    public static final Long serialVersionUID = 1L;
    private String codmat;
    private String nombremat;
    private int cred, numhoras, tipomat;

    public Materia(){}

    public Materia (String codmat,String nombremat){
        this.codmat = codmat;
        this.nombremat = nombremat;
    }
    public Materia (int cred, int numhoras, int tipomat){
        this.cred = cred;
        this.numhoras = numhoras;
        this.tipomat = tipomat;
    }
    public String getCodmat() {
        return codmat;
    }
    public void setCodmat(String codmat) {
        this.codmat = codmat;
    }
    public String getNombremat() {
        return nombremat;
    }
    public void setNombremat(String nombremat) {
        this.nombremat = nombremat;
    }
    public int getCred() {
        return cred;
    }
    public void setCred(int cred) {
        this.cred = cred;
    }
    public int getNumhoras() {
        return numhoras;
    }
    public void setNumhoras(int numhoras) {
        this.numhoras = numhoras;
    }
    public int getTipomat() {
        return tipomat;
    }
    public void setTipomat(int tipomat) {
        this.tipomat = tipomat;
    }
}
