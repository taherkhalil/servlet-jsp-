package ass.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
// @WebFilter(dispatcherTypes = {
// DispatcherType.REQUEST,
// DispatcherType.FORWARD,
// DispatcherType.ERROR
// }
// , urlPatterns = { "/AuthenticationFilter" }, servletNames = { "profile" })
public class AuthenticationFilter implements Filter {

	/**
	 * Default constructor.
	 * 
	 */
	

	public AuthenticationFilter() {
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
		HashMap<String,String> database =new HashMap();
		database.put("taher", "123");
		database.put("shirin", "1234");
		database.put("taha", "123");
		database.put("aamir", "123");
		database.put("abida", "1234");
		// TODO Auto-generated method stub
		// place your code here
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("filter called");
		if (password.equals(database.get(username))) {
			HttpServletResponse httpResponse = (HttpServletResponse) response;
			
			System.out.println("logged in");

			httpResponse.sendRedirect("/Profile/profile.jsp");
			chain.doFilter(request, response);

		} else {
			System.out.println("invalid username or password");
			HttpServletResponse httpResponse = (HttpServletResponse) response;
			System.out.println("Filter redirect to login.jsp");
			httpResponse.sendRedirect("login.jsp");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
