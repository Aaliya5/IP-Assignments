import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.HashMap;

public class Rank extends HttpServlet{
	
   private static final long serialVersionUID = 1L;

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      String regNo = request.getParameter("reg");

      HashMap<String, Integer> rankData = new HashMap<String, Integer>();
      rankData.put("4001", 5);
      rankData.put("4002", 1);
      rankData.put("4003", 2);
      rankData.put("4004", 4);
      rankData.put("4005", 3);

      if(rankData.containsKey(regNo)){
         int rank = rankData.get(regNo);
         out.println("<html><body>");
         out.println("<h2>Rank Found:</h2>");
         out.println("<p>Rank: " + rank + "</p>");
         out.println("</body></html>");
      }
      else{
         out.println("<html><body>");
         out.println("<h2>Rank not found</h2>");
         out.println("</body></html>");
      }
   }
}
