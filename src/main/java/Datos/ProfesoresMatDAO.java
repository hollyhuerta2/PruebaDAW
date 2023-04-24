package Datos;

import Modelo.HAHP.ProfesoresMaterias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfesoresMatDAO {
    private static final String selectSQL ="SELECT *FROM alumnos";

    public List<ProfesoresMaterias> listar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ProfesoresMaterias profmat = null;
        List<ProfesoresMaterias> profes = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idprof = rs.getInt("idprofe");
                int idmat= rs.getInt("idmateria");
                profmat = new ProfesoresMaterias(idprof,idmat);
                profes.add(profmat);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return profes;
    }
}
