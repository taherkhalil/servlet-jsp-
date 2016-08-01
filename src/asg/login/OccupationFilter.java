package asg.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class OccupationFilter
 */
@WebFilter("/OccupationFilter")
public class OccupationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public OccupationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletResponse res = (HttpServletResponse) response;
		String company = (String) request.getParameter("company");
	
		 String designation = (String) request.getParameter("designation");
		
		 String salary = (String) request.getParameter("salary");
		if(company.isEmpty()|| designation.isEmpty()|| salary.isEmpty())
			{
				PrintWriter out=res.getWriter();
				out.print("PLEASE ENTER ALL VALUES");
				
				request.getRequestDispatcher("OccupationProfile.jsp").include(request, res);
			}
			
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
