package Datos;
import Modelo.HAHP.Alumnos;
import java.sql.*;
import java.util.*;
import java.util.Date;

//DAO = Data Access Object
public class AlumnosDAO {
    private static final String selectSQL ="SELECT *FROM alumnos";

    public List<Alumnos> listar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Alumnos alum = null;
        List<Alumnos> alumnos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int matricula = rs.getInt("matricula");
                String nombre = rs.getString("nombre");
                String paterno = rs.getString("ape_pat");
                String materno = rs.getString("ape_mat");
                int edad = rs.getInt("edad");
                String celular = rs.getString("celular");
                String direc = rs.getString("direccion");
                String email = rs.getString("email");
                Date fecha = rs.getDate("fecha_nam");
                alum = new Alumnos(matricula,nombre,paterno,materno,edad,celular,direc,email,fecha);
                alumnos.add(alum);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return alumnos;
    }
}
