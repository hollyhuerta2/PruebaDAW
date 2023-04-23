package Modelo.HAHP;

import java.io.Serializable;

public class Semestres implements Serializable {

    private static final Long serialVersionUID = 1L;
    private int idsem, numsem; //el id del semestre y su numero

    public Semestres(){
    }
    public Semestres(int idesem,int numsem){
        this.idsem= idesem;
        this.numsem= numsem;
    }
    public int getIdsem() {return idsem;}
    public void setIdsem(int idsem) {
        this.idsem = idsem;
    }
    public int getNumsem() {return numsem;}
    public void setNumsem(int numsem) {
        this.numsem = numsem;
    }
}
