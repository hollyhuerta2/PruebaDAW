package Modelo.HAHP;

import java.io.Serializable;

public class CursoSalon implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int curso1;
    private int cursofk;
    private int salonfk;
    private String dia, hora,mes;
    public CursoSalon(){
    }
    public CursoSalon(int curso1, int cursofk, int salonfk, String dia, String hora, String mes) {
        this.curso1 = curso1;
        this.cursofk = cursofk;
        this.salonfk = salonfk;
        this.dia = dia;
        this.hora = hora;
        this.mes = mes;
    }

    public CursoSalon(int curso1, int cursofk, int salonfk){
        this.curso1 = curso1;
        this.cursofk = cursofk;
        this.salonfk = salonfk;
    }
    public CursoSalon(String dia, String hora,String mes){
        this.dia = dia;
        this.hora = hora;
        this.mes = mes;
    }
    public int getCurso1() {
        return curso1;
    }
    public void setCurso1(int curso1) {
        this.curso1 = curso1;
    }
    public int getCursofk() {
        return cursofk;
    }
    public void setCursofk(int cursofk) {
        this.cursofk = cursofk;
    }
    public int getSalonfk() {
        return salonfk;
    }
    public void setSalonfk(int salonfk) {
        this.salonfk = salonfk;
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
}
