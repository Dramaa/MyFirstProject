package disk;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Comon2 extends HttpServlet {
    static HttpServletRequest req=null;
    static HttpServletResponse resp=null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.req=req;
        this.resp=resp;
        resp.setContentType("text/html");
        String Path= java.net.URLDecoder.decode(req.getParameter("str"));//接收jsp的参数
        List<String> list= null;//文件名
        List<String> Pathlist=null;
        try {
            list = DiskTest2.Como(Path);
            Pathlist=DiskTest2.ComoPathList(Path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.getSession().setAttribute("SonDisk",list);//短的文件名
        req.getSession().setAttribute("PathPath",Pathlist);//页面上每个url绝对路径
        req.getSession().setAttribute("ThisPath",Path);//当前的路径

      //  getServletContext().getRequestDispatcher("/demo\\hello2.jsp").forward(req,resp);
        req.getRequestDispatcher("/demo\\hello2.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
