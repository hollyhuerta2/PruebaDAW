package Controlador;

import Datos.TipoEstudiosDAO;
import Modelo.HAHP.TipoEstudios;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletTipoEstudios")
public class ServletTipoEstudios extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
            throws ServletException, IOException {
        List<TipoEstudios> tipoEstudios = new TipoEstudiosDAO().listar();
        System.out.println("TipoEstudios = " +tipoEstudios);
        hsreq.setAttribute("TipoEstudios", tipoEstudios);
        hsreq.getRequestDispatcher("TipoEstudios.jsp").forward(hsreq, hsres);
    }
}
