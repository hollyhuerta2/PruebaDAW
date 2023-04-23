package Modelo.HAHP;

import java.io.Serializable;

public class Salones implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int idesal;
    private String lugar;
    private int pupitres;

    public Salones(){
    }
    public Salones(int idesal,int pupitres){
        this.idesal = idesal;
        this.pupitres = pupitres;
    }
    public Salones(String lugar){
        this.lugar = lugar;
    }
    public int getIdesal() {return idesal;}
    public void setIdesal(int idesal) {
        this.idesal = idesal;
    }
    public String getLugar() {return lugar;}
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public int getPupitres() {return pupitres;}
    public void setPupitres(int pupitres) {
        this.pupitres = pupitres;
    }
}
