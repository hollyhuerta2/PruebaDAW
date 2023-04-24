package Datos;

import Modelo.HAHP.TipoEstudios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoEstudiosDAO {
    private static final String selectSQL ="SELECT *FROM tipoestudios";

    public List<TipoEstudios> listar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        TipoEstudios tipoestudio = null;
        List<TipoEstudios> tipoEstudios = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idest = rs.getInt("idest");
                String nomest= rs.getString("nomest");
                tipoestudio = new TipoEstudios(idest,nomest);
                tipoEstudios.add(tipoestudio);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return tipoEstudios;
    }
}
