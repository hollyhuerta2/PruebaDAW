package Controlador;


import Datos.SemestresDAO;
import Modelo.HAHP.Semestres;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletSemestre")
public class ServletSemestre extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
            throws ServletException, IOException {
        List<Semestres> semestre = new SemestresDAO().listar();
        System.out.println("Semestres = " +semestre);
        hsreq.setAttribute("Semestres", semestre);
        hsreq.getRequestDispatcher("Semestres.jsp").forward(hsreq, hsres);
    }
}
