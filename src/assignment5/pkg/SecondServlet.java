package assignment5.pkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class secondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private String operation="";  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	    String boolean1 = (String) request.getAttribute("bol1");
		String boolean2 = (String) request.getAttribute("bol2");
		String operation = (String) request.getAttribute("op");
		PrintBody(out,boolean1,boolean2,operation);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	   
	}	   
		
	private void PrintBody(PrintWriter out, String bol1, String bol2, String oper){
		

		out.println("<body onLoad=\"setFocus()\">");
	    out.println("<p>");
		out.println("A simple example that demonstrates how to operate with");
		out.println("Boolean variables using two servlets");
		out.println("By Rajaram Adhikari & Kshitiz Rimal");
		out.println("</p>");
		
		out.println(" <table BORDER=1  CELLPADDING=0 CELLSPACING=0 WIDTH=50% >");
	       out.println("  <tr>");
	       out.println("   <th>Row</th>");
	       out.println("   <th>"+bol1+"</th>");
	       out.println("   <th>"+bol2+" </th>");
	       out.println("   <th>Result</th>");
	       out.println("  </tr>");
	       
	       
	       if(oper.equals("AND") || oper.equals("&&")){
	    	   
	    	   out.println("  <tr>");
	    	   out.println("   <td>1");
	    	   out.println("   <td>false");
	    	   out.println("   <td>false");
	    	   out.println("   <td>false");
	    	   out.println("  </tr>");
	    	   out.println(" <br>");
	    	   
	    	   out.println("  <tr>");
	    	   out.println("   <td>2");
	    	   out.println("   <td>false");
	    	   out.println("   <td>true");
	    	   out.println("   <td>false");
	    	   out.println("  </tr>");
	    	   out.println(" <br>");
	    	 
	    	   out.println("  <tr>");
	    	   out.println("   <td>3");
	    	   out.println("   <td>true");
	    	   out.println("   <td>false");
	    	   out.println("   <td>false");
	    	   out.println("  </tr>");
	    	   out.println(" <br>");
	    	   
	    	   
	    	   out.println("  <tr>");
	    	   out.println("   <td>4");
	    	   out.println("   <td>true");
	    	   out.println("   <td>true");
	    	   out.println("   <td>true");
	    	   out.println("  </tr>");
	    	   out.println(" <br>");
	    	   
	    	   
	    	   
	       }
	       else if(oper.equals("OR") || oper.equals("||")){
	    	   
	    	   
	    	   out.println("  <tr>");
	    	   out.println("   <td>1");
	    	   out.println("   <td>false");
	    	   out.println("   <td>false");
	    	   out.println("   <td>false");
	    	   out.println("  </tr>");
	    	   out.println(" <br>");
	    	   
	    	   out.println("  <tr>");
	    	   out.println("   <td>2");
	    	   out.println("   <td>false");
	    	   out.println("   <td>true");
	    	   out.println("   <td>true");
	    	   out.println("  </tr>");
	    	   out.println(" <br>");
	    	 
	    	   out.println("  <tr>");
	    	   out.println("   <td>3");
	    	   out.println("   <td>true");
	    	   out.println("   <td>false");
	    	   out.println("   <td>true");
	    	   out.println("  </tr>");
	    	   out.println(" <br>");
	    	   
	    	   
	    	   out.println("  <tr>");
	    	   out.println("   <td>4");
	    	   out.println("   <td>true");
	    	   out.println("   <td>true");
	    	   out.println("   <td>true");
	    	   out.println("  </tr>");
	    	   out.println(" <br>");
	    	   //
	       	
	      }
	       
	    
	     out.println(" </table>");
	     out.println("");
	
	     out.println("<p>");

		out.println("Rajaram and Kshitiz collaborated on Assignment 8. Kshitiz worked on initial part of the page(main servlet), and Rajaram worked on second servlet to display the complete truth table. ");
		
		out.println("</p>");
		
			out.println("</p>");
	     out.println("</body>");
		
		
	}
		   	   
		


}
