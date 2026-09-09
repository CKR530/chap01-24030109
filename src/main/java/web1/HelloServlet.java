package web1;//需要修改成你自己的包名

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//需要将两处helloServlet修改成你实际的类名
//以下两行2选1
@WebServlet(name = "helloServlet", urlPatterns = { "/helloServlet.do" })
//@WebServlet(name = "helloServlet", urlPatterns = { "/1.4.do" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getParameter("name"));
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Hello Servlet</title></head>");
		out.println("<body>");
		out.println("<h3 style='color:#00f'>Hello,World!</h3>");
		out.println("现在的时间是:" + new java.util.Date());
		out.println("</body>");
		out.println("</html>");
	}
}
