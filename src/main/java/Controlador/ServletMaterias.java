package Controlador;

import Datos.MateriaDAO;
import Modelo.HAHP.Materia;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletMaterias")
public class ServletMaterias extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
            throws ServletException, IOException {
        List<Materia> materia = new MateriaDAO().listar();
        System.out.println("materia = " +materia);
        hsreq.setAttribute("materia", materia);
        hsreq.getRequestDispatcher("materia.jsp").forward(hsreq, hsres);
    }
}
