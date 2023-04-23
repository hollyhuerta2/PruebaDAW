package Controlador;

import Datos.AlumnosDAO;
import Modelo.HAHP.Alumnos;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletAlumnos")
public class ServletAlumnos extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
            throws ServletException, IOException {
        List<Alumnos> alumnos = new AlumnosDAO().listar();
        System.out.println("alumnos = " + alumnos);
        hsreq.setAttribute("alumnos", alumnos);
        hsreq.getRequestDispatcher("alumnos.jsp").forward(hsreq, hsres);
    }
}
