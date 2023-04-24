package Controlador;

import Datos.ProfesoresMatDAO;
import Modelo.HAHP.ProfesoresMaterias;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletProfeMat")
public class ServletProfeMat extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
            throws ServletException, IOException {
        List<ProfesoresMaterias> profemateria = new ProfesoresMatDAO().listar();
        System.out.println("profemateria = " +profemateria);
        hsreq.setAttribute("profemateria", profemateria);
        hsreq.getRequestDispatcher("profemateria.jsp").forward(hsreq, hsres);
    }
}
