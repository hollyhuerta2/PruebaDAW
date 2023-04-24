package Controlador;

import Datos.CursoSalonDAO;
import Modelo.HAHP.CursoSalon;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletCursos")
public class ServletCursoSalon extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
            throws ServletException, IOException {
        List<CursoSalon> cursosalon = new CursoSalonDAO().listar();
        System.out.println("cursoSalon = " +cursosalon);
        hsreq.setAttribute("cursoSalon", cursosalon);
        hsreq.getRequestDispatcher("cursoSalon.jsp").forward(hsreq, hsres);
    }
}
