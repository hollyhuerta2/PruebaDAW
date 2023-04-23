package Modelo.HAHP;
import java.io.Serializable;
public class TipoEstudios implements Serializable{

    public static final Long serialVersionUID = 1L;
    private int idest;
    private String nomest; //nombre del tipo de estudios

    public TipoEstudios(){
    }
    public TipoEstudios(int idest){
        this.idest = idest;
    }
    public TipoEstudios(String nomest){
        this.nomest = nomest;
    }
    public TipoEstudios(int idest,String nomest){
        this.idest = idest;
        this.nomest = nomest;
    }
    public int getIdest() {
        return idest;
    }
    public void setIdest(int idest) {
        this.idest = idest;
    }
    public String getNomest(){
        return nomest;
    }
    public void setNomest(String nomest) {
        this.nomest = nomest;
    }
    @Override
    public String toString(){return "Tipo de contrato: " + idest + " " + nomest;}
}
