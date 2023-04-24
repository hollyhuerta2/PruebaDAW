package Controlador;

import Datos.SalonesDAO;
import Modelo.HAHP.Salones;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletSalones")
public class ServletSalones extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
            throws ServletException, IOException {
        List<Salones> salon = new SalonesDAO().listar();
        System.out.println("Salones = " +salon);
        hsreq.setAttribute("Salones", salon);
        hsreq.getRequestDispatcher("Salones.jsp").forward(hsreq, hsres);
    }
}
