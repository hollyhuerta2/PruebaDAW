package Datos;
import java.sql.*;
import java.util.*;
import java.util.Date;
import Modelo.HAHP.Profesores;

//DAO = Data Access Object
public class ProfesoresDAO {
    private static final String selectSQL ="SELECT *FROM profesores";

    public List<Profesores> listar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Profesores prof = null;
        List<Profesores> profesores = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idprof = rs.getInt("idP");
                String nombre = rs.getString("nombre");
                String paterno = rs.getString("ape_pat");
                String materno = rs.getString("ape_mat");
                String idcont = rs.getString("idcontratofk");
                String materiaesp = rs.getString("materia_esp");
                String direc = rs.getString("direccion");
                String telef = rs.getString("telef");
                String celu = rs.getString("celular");
                String idetipoest = rs.getString("idtipoestfk");
                String email = rs.getString("email");
                Date fechaNam = rs.getDate("fecha_nam");
                String lugar = rs.getString("lugar_est");
                prof = new Profesores(idprof,nombre,paterno,materno,idcont,materiaesp,direc,telef,celu,idetipoest,email,fechaNam,lugar);
                profesores.add(prof);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return profesores;
    }
}

