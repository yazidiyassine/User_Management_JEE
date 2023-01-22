package useMngt;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/update")
public class update extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		int id = Integer.parseInt(req.getParameter("id"));
		String username = req.getParameter("userName");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String dob = req.getParameter("dob");
		String city = req.getParameter("city");
		String gender = req.getParameter("gender");
		
		user u = new user();
		u.setName(username);
		u.setEmail(email);
		u.setMobile(mobile);
		u.setDob(dob);
		u.setCity(city);
		u.setGender(gender);
		u.setId(id);
		
		int t = Doa.edit(u);
		if(t>0) {
			res.sendRedirect("showAll.jsp");
		}else {
			
			out.print("There is an error.");
		}
		
	}
}
