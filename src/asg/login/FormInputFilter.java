package asg.login;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class FormInputFilter
 */
//@WebFilter("/FormInputFilter")
public class FormInputFilter implements Filter {


	/**
     * Default constructor. 
     */
	
	
    public FormInputFilter() {
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
		// TODO Auto-generated method stub
		// place your code here

		HttpServletResponse res = (HttpServletResponse) response;		
		String email=(String) request.getParameter("email");
		String address=(String) request.getParameter("addr");
		String number=(String) request.getParameter("no");
		if(email.isEmpty()&& address.isEmpty() && number.isEmpty())
		{
			System.out.println("please fill the values ");
			request.getRequestDispatcher("Profile/profile.jsp").forward(request, response);
		}
		
		if(email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
			
));
		{
			//&& number.matches("(\d{7})|(\d{10)| ...")
			System.out.println("please fill the values ");
			request.getRequestDispatcher("Profile/profile.jsp").forward(request, response);
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
