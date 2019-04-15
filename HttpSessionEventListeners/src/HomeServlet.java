import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/login")
public class HomeServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session=request.getSession();
		ServletContext context=getServletContext();
		
		out.print("Online users: "+context.getAttribute("Online"));
		out.print("Total users: "+context.getAttribute("Total"));
		
		out.println("<br/> <a href='logout'>Logout</a>");
	}
}
