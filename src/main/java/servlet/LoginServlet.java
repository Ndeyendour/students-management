package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AuthService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	AuthService service = new AuthService();


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(arg0, arg1);
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 service.authentication(req, res);
}
}
