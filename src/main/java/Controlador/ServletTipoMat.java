package Controlador;


import Datos.TipoMateriaDAO;
import Modelo.HAHP.TipoMateria;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletTipoEstudios")
public class ServletTipoMat extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
            throws ServletException, IOException {
        List<TipoMateria> tipoMaterias = new TipoMateriaDAO().listar();
        System.out.println("TipoMaterias = " +tipoMaterias);
        hsreq.setAttribute("TipoMaterias", tipoMaterias);
        hsreq.getRequestDispatcher("TipoMaterias.jsp").forward(hsreq, hsres);
    }
}
