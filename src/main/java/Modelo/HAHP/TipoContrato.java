package Modelo.HAHP;

import java.io.Serializable;
public class TipoContrato implements Serializable{

    private static final Long serialVersionUID = 1L;
    private int idcont;
    private String nombreCont;

    public TipoContrato(){
    }

    public TipoContrato(int idcont){
        this.idcont = idcont;
    }
    public TipoContrato(String nombreCont){
        this.nombreCont = nombreCont;
    }
    public TipoContrato(int idcont, String nombreCont) {
        this.idcont = idcont;
        this.nombreCont = nombreCont;

    }
    public int getIdcont() {
        return idcont;
    }
    public void setIdcont(int idcont) {
        this.idcont = idcont;
    }

    public String getNombreCont() {
        return nombreCont;
    }

    public void setNombreCont(String nombrecont) {
        this.nombreCont = nombrecont;
    }

    @Override
    public String toString(){return "Tipo de contrato: " + idcont + " " + nombreCont;}
}
