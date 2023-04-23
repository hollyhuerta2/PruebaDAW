package Modelo.HAHP;

import java.io.Serializable;

public class Cursos implements Serializable {

    public static final Long serialVersionUID = 1L;
    private int idcurso;
    private String materiafk, horario;
    private int profk, semesfk, cupo;

    public Cursos(){}

    public Cursos(int idcurso, String materiafk, String horario, int profk, int semesfk, int cupo) {
        this.idcurso = idcurso;
        this.materiafk = materiafk;
        this.horario = horario;
        this.profk = profk;
        this.semesfk = semesfk;
        this.cupo = cupo;
    }
    public Cursos(int idcurso, int profk, int semesfk, int cupo){
        this.idcurso = idcurso;
        this.profk= profk;
        this.semesfk= semesfk;
        this.cupo= cupo;
    }
    public Cursos(String materiafk, String horario){
        this.materiafk = materiafk;
        this.horario = horario;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }
    public int getProfk() {
        return profk;
    }
    public void setProfk(int profk) {
        this.profk = profk;
    }
    public int getSemesfk() {
        return semesfk;
    }

    public void setSemesfk(int semesfk) {
        this.semesfk = semesfk;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public String getMateriafk() {
        return materiafk;
    }

    public void setMateriafk(String materiafk) {
        this.materiafk = materiafk;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
}
