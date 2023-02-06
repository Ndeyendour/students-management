package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ServletService;
@WebServlet(urlPatterns = "/markasdone.do")
public class ChangeStatusServlet extends HttpServlet {

    ServletService service = new ServletService();
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        service.markAsDone(httpServletRequest, httpServletResponse);
    }

}
