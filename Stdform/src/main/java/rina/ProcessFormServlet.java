package rina;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.Store;

@WebServlet("/ProcessFormServlet")
public class ProcessFormServlet extends HttpServlet {
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	
        
        String name = request.getParameter("userName");
        String pwd_f = request.getParameter("password");
        
        String user = "admin";
        String pwd = "admin";
        
        
        if(name.equals(user) && pwd_f.equals(pwd)) {

        
        
        request.setAttribute("name", name);
        request.setAttribute("pwd_f", pwd_f);

        
        request.getRequestDispatcher("/result.jsp").forward(request, response);
        }else {
        	
        	response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('wrong password');</script>");
        	
        }
	}
}
