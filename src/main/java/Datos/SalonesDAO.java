package Datos;


import Modelo.HAHP.Salones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalonesDAO {
    private static final String selectSQL ="SELECT *FROM salones";

    public List<Salones> listar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Salones salon = null;
        List<Salones> salonn = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idesal = rs.getInt("idesalones");
                String lugar = rs.getString("lugar");
                int pupitres= rs.getInt("pupitres");
                salon = new Salones();
                salonn.add(salon);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return salonn;
    }
}
