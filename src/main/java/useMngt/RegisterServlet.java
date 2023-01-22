package useMngt;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,
	IOException{
	
		
				}
		
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,
	IOException{
		res.setContentType("text/html");PrintWriter out = res.getWriter();
		String name = req.getParameter("userName");
		String mobile = req.getParameter("mobile");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String city = req.getParameter("city");
		String gender = req.getParameter("gender");
		
		user u = new user();
		u.setName(name);
		u.setEmail(email);
		u.setMobile(mobile);
		u.setCity(city);
		u.setGender(gender);
		u.setDob(dob);
		Doa rd = new Doa();
		
		int rs = rd.insert(u);
		if(rs == 1) {
			out.println("<h2>Successfully registered.</h2>");
			out.print("<h4 ><a href=home.jsp>Home</a></h4>");
			out.print("<h4 ><a href=showAll.jsp>show</a></h4>");
		}else {
			out.print("There is an error!");
		}
		
	}
}
