package Controlador;
import Datos.ProfesoresDAO;
import Modelo.HAHP.Profesores;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/ServletProfesores")
public class ServletProfesores extends HttpServlet {
        private static final long serialVersionUID = 1L;
        @Override
        protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
                throws ServletException, IOException {
            List<Profesores> profesores = new ProfesoresDAO().listar();
            System.out.println("profesores = " + profesores);
            hsreq.setAttribute("profesores", profesores);
            hsreq.getRequestDispatcher("profesores.jsp").forward(hsreq, hsres);
        }
}
