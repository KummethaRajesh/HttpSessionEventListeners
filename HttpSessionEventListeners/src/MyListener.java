import javax.servlet.*;
import javax.servlet.http.*;

public class MyListener implements HttpSessionListener {
	
	ServletContext context=null;
	int totalUsers=0,onlineUsers=0;
	
	public void sessionCreated(HttpSessionEvent event) {
		context=event.getSession().getServletContext();
		
		totalUsers++;
		onlineUsers++;
		context.setAttribute("Online", onlineUsers);
		context.setAttribute("Total", totalUsers);
	}
	
	public void sessionDestroyed(HttpSessionEvent e) {
		onlineUsers--;
		context.setAttribute("Online", onlineUsers);
	}
	

}
