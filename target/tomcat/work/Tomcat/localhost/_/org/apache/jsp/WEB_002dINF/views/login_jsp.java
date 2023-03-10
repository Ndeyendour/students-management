/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-05-12 17:52:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("    <title>WELCOME TO TDSI</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("  <!-- <link href=\"cap.css\" rel=\"stylesheet\"> -->\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"min-height: 100vh;display: flex; justify-content: center; align-items: center;\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container\" style=\"display: flex; justify-content: center; align-items: center;\">\r\n");
      out.write("        <div class=\"card\" style=\"width: 42rem;\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("                <h1 class=\"card-title text-center\">Login</h1>\r\n");
      out.write("                <h3 class=\"card-subtitle mb-2 text-muted text-center\">Welcome to TDSI</h3>\r\n");
      out.write("                <br/>\r\n");
      out.write("                ");
 if(request.getAttribute("errorMessage") != null) { 
      out.write("\r\n");
      out.write("                    <div class=\"alert alert-danger alert-dismissible fade show\" role=\"alert\">\r\n");
      out.write("                        <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</strong> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\r\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("                <p class=\"card-text\">\r\n");
      out.write("                    <form action=\"/login.do\" method=\"post\">\r\n");
      out.write("                        <div class=\"input-group mb-3\">\r\n");
      out.write("                            <div class=\"input-group-prepend\">\r\n");
      out.write("                                <span class=\"input-group-text\" id=\"basic-addon1\"><i class='bx bxs-user'></i></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Username\" aria-label=\"Username\" aria-describedby=\"basic-addon1\" id=\"username\" name=\"username\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                        <div class=\"input-group mb-3\">\r\n");
      out.write("                            <div class=\"input-group-prepend\">\r\n");
      out.write("                                <span class=\"input-group-text\" id=\"password-addon\"><i class='bx bxs-lock-alt'></i></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" placeholder=\"Password\" aria-label=\"Password\" aria-describedby=\"password-addon\" name=\"password\" id=\"password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Login</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"webjars/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"webjars/popper.js/2.9.3/umd/popper.js\"></script>\r\n");
      out.write("    <script src=\"webjars/bootstrap/4.6.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
