package register;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import register.DAO.UserDetails;
import register.Entity.UserData;

@WebServlet("/register")
public class register extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String userid = req.getParameter("userid");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String repassword = req.getParameter("repassword");
		
		if(UserDetails.isExist(userid)) {
			HttpSession session = req.getSession();
			session.setAttribute("msg", "Userid already exist");
			resp.sendRedirect("index.jsp");
			return;
		}
		
		
		String email2="^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";
		String name2="[a-zA-Z_ ]{2,}";
		String userid2="[\\w-.]+";
		
		if(!(password.equals(repassword))) {
			
			HttpSession session = req.getSession();
			session.setAttribute("msg", "Miss match password");
			resp.sendRedirect("index.jsp");
			return;
		}else if(!(email.matches(email2))) {
			
			HttpSession session = req.getSession();
			session.setAttribute("msg", "Invailed Email");
			resp.sendRedirect("index.jsp");
			return;
		}else if(!(userid.matches(userid2))) {
			
			HttpSession session = req.getSession();
			session.setAttribute("msg", "Invailed Userid");
			resp.sendRedirect("index.jsp");
			return;
		}else if(!(name.matches(name2))) {
			
			HttpSession session = req.getSession();
			session.setAttribute("msg", "Invailed Name");
			resp.sendRedirect("index.jsp");
			return;
		}else if(age>=80 || age<=18) {
		
			HttpSession session = req.getSession();
			session.setAttribute("msg", "given age should be(18-80) ");
			resp.sendRedirect("index.jsp");
			return;
		}else {
			
			UserData ud = new UserData();
			ud.setName(name);
			ud.setAge(age);
			ud.setUserid(userid);
			ud.setEmail(email);
			ud.setPassword(password);
			
			if(UserDetails.save(ud)>0) {
				resp.sendRedirect("Login.jsp");
				return;
			}else {
				HttpSession session = req.getSession();
				session.setAttribute("msg", "something wrong in DB");
				resp.sendRedirect("index.jsp");
				return;
				
			}
		}	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userid = req.getParameter("userid");
		String password=req.getParameter("password");
		
		if(UserDetails.isValid(userid, password)) {
			HttpSession session = req.getSession();
			session.setAttribute("msg", "Welcome to "+userid);
			resp.sendRedirect("home.jsp");
			return;
		}else {
			HttpSession session = req.getSession();
			session.setAttribute("msg", "Wrong userid or password!");
			resp.sendRedirect("Login.jsp");
			return;
		}
	}
}
