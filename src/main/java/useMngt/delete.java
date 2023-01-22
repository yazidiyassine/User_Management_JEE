package useMngt;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/delete")
public class delete extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{	
		int id = Integer.parseInt(req.getParameter("id"));
		
		Doa.delete(id);
		res.sendRedirect("showAll.jsp");
	}
}
