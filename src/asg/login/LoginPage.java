package asg.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginPage
 */
// @WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap database = new HashMap();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// request.getRequestDispatcher("/profile.jsp").forward(request,
		// response);
		System.out.println("Login Page Called");

		// PrintWriter out = response.getWriter();
		// String username = request.getParameter("username");
		// String password = request.getParameter("password");
		// String mappass = (String) lp.database.get(username);
		// System.out.println("filter called");
		// if (lp.database.containsKey(username)&& mappass.equals(password)) {
		// HttpServletResponse httpResponse = (HttpServletResponse) response;
		// out.print("condition satisfied");
		// System.out.println("condition satisfied");
		//
		// httpResponse.sendRedirect("/form/profile.jsp");
		// }
		// else {
		// out.println("invalid username or password");
		// HttpServletResponse httpResponse = (HttpServletResponse) response;
		// System.out.println("Filter redirect to login.jsp");
		// httpResponse.sendRedirect("login.jsp");
		// }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		HttpSession se= request.getSession(true);
//		se.setMaxInactiveInterval(1);
		System.out.println("inside login page");
		System.out.println(request.getParameter("username"));
		String username = request.getParameter("username");
		
		System.out.println(request.getSession(false).getId());
		
//		if(se.isNew())
//		{
//			se.setAttribute("username", username);
//		}
//		else{
//			se.getAttribute(username);
//			request.getSession(false);
//		}
		this.getServletContext().setAttribute("username", username);
	}

}
