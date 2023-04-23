package Datos;


import Modelo.HAHP.CursoAlumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoAlumnoDAO {
    private static final String selectSQL ="SELECT *FROM cursos";
    public List<CursoAlumno> listar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        CursoAlumno curso = null;
        List<CursoAlumno> cursoalum = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idcursoa = rs.getInt("idcurso");
                int alumfk = rs.getInt("alumno");
                int cursofk1 = rs.getInt("curso");
                int calif = rs.getInt("calificacion");
                String opo = rs.getString("oportunidad");
                curso = new CursoAlumno(idcursoa,alumfk,cursofk1,calif,opo);
                cursoalum.add(curso);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return cursoalum;
    }
}
