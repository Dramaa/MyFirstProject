package disk;

import sun.misc.Request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Comon extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String Path= java.net.URLDecoder.decode(req.getParameter("str"));//接收jsp的参数
        List<String> list= null;//文件名
        try {
            list = DiskTest2.Como(Path);
        } catch (Exception e) {
            e.printStackTrace();
        }

        req.getSession().setAttribute("SonDisk",list);
        req.getSession().setAttribute("ThisPath",Path);

      //  getServletContext().getRequestDispatcher("/demo\\hello2.jsp").forward(req,resp);
        req.getRequestDispatcher("/demo\\hello2.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
