import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String indexString = request.getParameter("index");
    int index = Integer.parseInt(indexString);
    String[] name = {"Aaliya", "Anitha", "Harshini", "Janani","Swetha"};
    String value =name[index];
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>Welcome " + value + "</h1>");
    out.println("</body>");
    out.println("</html>");
  }
}
