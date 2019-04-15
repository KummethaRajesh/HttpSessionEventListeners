import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		HttpSession session=request.getSession(false);
		session.invalidate();
		
		PrintWriter out=response.getWriter();
		out.print("Logged out");
	}
}
