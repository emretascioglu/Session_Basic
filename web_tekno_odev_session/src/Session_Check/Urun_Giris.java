package Session_Check;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Urun_Giris")
public class Urun_Giris extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Urun_Giris() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		Enumeration<String> sessions = session.getAttributeNames();
		while (sessions.hasMoreElements()) {
			response.getWriter().print("<p> Sepetteki Urun : "+ session.getAttribute(sessions.nextElement()) +"</p>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doGet(request, response);
	}
}