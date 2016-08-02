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
 * Servlet Filter implementation class FormInputFilter
 */
// @WebFilter("/FormInputFilter")
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		PrintWriter pw = new PrintWriter(System.out, true);
		HttpServletResponse res = (HttpServletResponse) response;
		String college = (String) request.getParameter("college");
		String degree = (String) request.getParameter("degree");
		String percentage = (String) request.getParameter("percentage");

		String email = (String) request.getParameter("email");
		String address = (String) request.getParameter("addr");
		String number = (String) request.getParameter("number");

		if (college.isEmpty() || degree.isEmpty() || percentage.isEmpty() || !college.matches("^[a-zA-Z\\s]*$") || !degree.matches("^[a-zA-Z\\s]*$") || percentage.length()>2) {
			System.out.println("please fill the values and currect values and only 2 digits for % ");

			PrintWriter out = res.getWriter();
			out.print("please enter values");

			request.getRequestDispatcher("EducationalProfile.jsp").include(request, res);
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
