package Controlador;

import Datos.TipoContratoDAO;
import Modelo.HAHP.TipoContrato;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletTipoCont")
public class ServletTipoCont extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
            throws ServletException, IOException {
        List<TipoContrato> tipocontrato = new TipoContratoDAO().listar();
        System.out.println("TipoContrato = " +tipocontrato);
        hsreq.setAttribute("TipoContrato", tipocontrato);
        hsreq.getRequestDispatcher("TipoContrato.jsp").forward(hsreq, hsres);
    }
}
