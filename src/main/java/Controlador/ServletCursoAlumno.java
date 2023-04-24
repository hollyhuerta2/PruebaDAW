package Controlador;

import Datos.CursoAlumnoDAO;
import Modelo.HAHP.CursoAlumno;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletCursoAlumno")
public class ServletCursoAlumno extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
            throws ServletException, IOException {
        List<CursoAlumno> cursos = new CursoAlumnoDAO().listar();
        System.out.println("cursosalumno = " +cursos);
        hsreq.setAttribute("cursoalumno", cursos);
        hsreq.getRequestDispatcher("cursoalumno.jsp").forward(hsreq, hsres);
    }
}
