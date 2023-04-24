package Datos;

import Modelo.HAHP.Materia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MateriaDAO {
    private static final String selectSQL ="SELECT *FROM cursos";
    public List<Materia> listar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Materia mat = null;
        List<Materia> materias = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                String codmat = rs.getString("codigomat");
                String nombremat = rs.getString("nombremateria");
                int cred = rs.getInt("creditos");
                int numhoras = rs.getInt("numhoras");
                int tipomat = rs.getInt("tipomateria");
                mat = new Materia(codmat,nombremat,cred,numhoras,tipomat);
                materias.add(mat);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return materias;
    }
}
