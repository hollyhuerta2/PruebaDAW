package Modelo.HAHP;

import java.io.Serializable;

public class CursoAlumno implements Serializable {
   private static final Long serialVersionUID = 1L;
    private int idcursoa;
    private int alumfk, cursofk1,calif;
    private String opo;//oportunidad

    public CursoAlumno(){
    }
    public CursoAlumno(int idcursoa, int alumfk, int cursofk1,int calif){
        this.idcursoa = idcursoa;
        this.alumfk = alumfk;
        this.cursofk1 = cursofk1;
        this.calif = calif;
    }
    public CursoAlumno(String opo){
        this.opo =opo;
    }
    public int getIdcursoa() {return idcursoa;}
    public void setIdcursoa(int idcursoa) {
        this.idcursoa = idcursoa;
    }
    public int getAlumfk() {return alumfk;}

    public void setAlumfk(int alumfk) {
        this.alumfk = alumfk;
    }
    public int getCursofk1() {return cursofk1;}

    public void setCursofk1(int cursofk1) {
        this.cursofk1 = cursofk1;
    }
    public int getCalif() {return calif;}
    public void setCalif(int calif) {
        this.calif = calif;
    }
    public String getOpo() {return opo;}

    public void setOpo(String opo) {
        this.opo = opo;
    }
}
