package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import service.ServletService;

@WebServlet(urlPatterns = "/students.do")
public class StudentServlet  extends HttpServlet {
	 private ServletService service = new ServletService();

	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        service.showList(request, response);
	    }

	    @Override
	   protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
	        service.createStudent(httpServletRequest, httpServletResponse);
	        
	    }
	 
	 
}
