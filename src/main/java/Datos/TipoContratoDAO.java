package Datos;

import Modelo.HAHP.TipoContrato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoContratoDAO {
    private static final String selectSQL ="SELECT *FROM tipocontrato";

    public List<TipoContrato> listar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        TipoContrato tipoContrato = null;
        List<TipoContrato> tipocont = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idcont = rs.getInt("idcontrato");
                String nombreCont= rs.getString("nombrecont");
                tipoContrato = new TipoContrato(idcont,nombreCont);
                tipocont.add(tipoContrato);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return tipocont;
    }
}
