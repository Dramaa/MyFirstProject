package disk;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServletTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a="测试成功了呢 O(∩_∩)O~";
       // getServletContext().setAttribute("myParam",a);
       //resp.sendRedirect("\\demo\\jspTest.jsp");
        req.getSession().setAttribute("myParam1", a);
        getServletContext().getRequestDispatcher("/demo\\jspTest.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
