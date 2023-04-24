package Datos;

import Modelo.HAHP.TipoMateria;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TipoMateriaDAO {
    private static final String selectSQL ="SELECT *FROM tipomateria";

    public List<TipoMateria> listar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        TipoMateria tipomateria = null;
        List<TipoMateria> tipoMaterias = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idmat = rs.getInt("idmat");
                String materia= rs.getString("materia");
                tipomateria = new TipoMateria(idmat,materia);
                tipoMaterias.add(tipomateria);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return tipoMaterias;
    }
}
