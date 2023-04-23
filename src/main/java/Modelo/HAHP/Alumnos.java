package Modelo.HAHP;

import java.io.Serializable;
import java.time.LocalDate;

public class Alumnos implements Serializable {
    private static final Long serialVersionUID = 1L;
    private int matricula;
    private Nombrecom nombrealum;
    private int edad;
    private LocalDate fecha;
    private String celular, email, direc;

    public Alumnos (){
    }
    public Alumnos(int matricula, Nombrecom nombrealum,int edad,LocalDate fecha){
        this.matricula = matricula;
        this.nombrealum = nombrealum;
        this.edad = edad;
        this.fecha = fecha;
    }
    public Alumnos(String celular,String email,String direc){
        this.celular = celular;
        this.email = email;
        this.direc = direc;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Nombrecom getNombrealum(Nombrecom nombrealum){
        return nombrealum;
    }
    public void setNombrealum(Nombrecom nombrealum) {
        this.nombrealum = nombrealum;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDirec() {
        return direc;
    }
    public void setDirec(String direc) {
        this.direc = direc;
    }
}
