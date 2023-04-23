package Modelo.HAHP;

import java.io.Serializable;

public class TipoMateria implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int idmat;
    private String materia;

    public TipoMateria(){
    }
    public TipoMateria(int idmat){
        this.idmat = idmat;
    }
    public TipoMateria(String materia){
        this.materia =materia;
    }
    public TipoMateria(int idmat, String materia){
        this.idmat = idmat;
        this.materia =materia;
    }

    public int getIdmat() {return idmat;}
    public void setIdmat(int idmat) {
        this.idmat = idmat;
    }
    public String getMateria() {return materia;}
    public void setMateria(String materia) {
        this.materia = materia;
    }
}
