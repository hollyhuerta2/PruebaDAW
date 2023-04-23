package Controlador;

import Datos.CursosDAO;
import Modelo.HAHP.Cursos;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletCursos")
public class ServletCursos extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
            throws ServletException, IOException {
        List<Cursos> cursos = new CursosDAO().listar();
        System.out.println("cursos = " +cursos);
        hsreq.setAttribute("cursos", cursos);
        hsreq.getRequestDispatcher("cursos.jsp").forward(hsreq, hsres);
    }
}
