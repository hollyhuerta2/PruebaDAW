package Datos;

import Modelo.HAHP.CursoSalon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoSalonDAO {
    private static final String selectSQL ="SELECT *FROM cursos";
    public List<CursoSalon> listar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        CursoSalon curso = null;
        List<CursoSalon> cursosalon = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int curso1 = rs.getInt("curso1");
                int cursofk = rs.getInt("curspfk");
                int salonfk = rs.getInt("salonfk");
                String dia = rs.getString("dia");
                String hora = rs.getString("hora");
                String mes = rs.getString("mes");
                curso = new CursoSalon(curso1,cursofk,salonfk,dia,hora,mes);
                cursosalon.add(curso);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return cursosalon;
    }
}
