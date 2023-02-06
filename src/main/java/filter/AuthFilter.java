package filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.sun.org.apache.xalan.internal.xsltc.dom.Filter;

public class AuthFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        if (request.getSession().getAttribute("username") != null){
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            request.getRequestDispatcher("/login.do")
                    .forward(servletRequest, servletResponse);
        }
    }

    public void destroy() {

    }

	@Override
	public boolean test(int node) {
		// TODO Auto-generated method stub
		return false;
	} 

}
