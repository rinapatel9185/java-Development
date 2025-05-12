package rina;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.catalina.Store;

/**
 * Servlet implementation class ProcessFormServlet
 */
@WebServlet("/ProcessFormServlet")
public class ProcessFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("userName");
        String email = request.getParameter("userEmail");

        
        request.setAttribute("name", name);
        request.setAttribute("email", email);

        
        request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
