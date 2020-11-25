package assignment5.pkg;

//Import Java Libraries
import java.io.*;
import java.util.*;

//Import Servlet Libraries
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		   
		String Bolean1 = request.getParameter("bool1");
		String Bolean2 = request.getParameter("bool2");
		String Operator = request.getParameter("operation");
				
		request.setAttribute("bol1", Bolean1);
		request.setAttribute("bol2", Bolean2);
		request.setAttribute("op", Operator);
		
		RequestDispatcher rd = request.getRequestDispatcher("secondServlet");
		rd.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
	}
	
	
	
	
	

}
