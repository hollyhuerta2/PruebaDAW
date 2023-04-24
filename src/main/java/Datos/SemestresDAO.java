package Datos;


import Modelo.HAHP.Semestres;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SemestresDAO {
    private static final String selectSQL ="SELECT *FROM Semestres";

    public List<Semestres> listar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Semestres sem = null;
        List<Semestres> semestre = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idsem = rs.getInt("idsemestre");
                int numsem= rs.getInt("numerosemestre");
                sem = new Semestres(idsem,numsem);
                semestre.add(sem);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return semestre;
    }
}
