package useMngt;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/editserv")
public class edit extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{
		 PrintWriter out = res.getWriter();
		int id = Integer.parseInt(req.getParameter("id"));
		 
		 
		user u = Doa.readUser(id);
		req.setAttribute("u", u);
		RequestDispatcher dis = req.getRequestDispatcher("edit.jsp");
		dis.forward(req, res);
		 		 }
}
