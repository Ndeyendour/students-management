package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Student;
import service.ServletService;


@WebServlet(urlPatterns = "/update-student.do")

public class UpdateStudentServlet extends HttpServlet {

	ServletService service = new ServletService();
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        service.retrieveStudent(httpServletRequest, httpServletResponse);
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        service.updateStudent(httpServletRequest, httpServletResponse);
    }

}
