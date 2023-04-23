package Modelo.HAHP;

import java.io.Serializable;

public class ProfesoresMaterias implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int ideprof;
    private int idemat;

    public ProfesoresMaterias(){
    }
    public ProfesoresMaterias(int ideprof, int idemat){
        this.ideprof= ideprof;
        this.idemat = idemat;
    }
    public int getIdeprof() {return ideprof;}
    public void setIdeprof(int ideprof) {
        this.ideprof = ideprof;
    }
    public int getIdemat() {return idemat;}
    public void setIdemat(int idemat) {
        this.idemat = idemat;
    }
}
