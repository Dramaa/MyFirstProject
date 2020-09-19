package disk;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.filechooser.FileSystemView;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
    public class Welcome extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");

            List<String> myroot=new ArrayList<String>();
            File[] roots = File.listRoots();
            FileSystemView sys = FileSystemView.getFileSystemView();
            for (int i = 0; i < roots.length; i++) {
                if(!sys.getSystemTypeDescription(roots[i]).equals("本地磁盘")){
                    continue;
                }
                //  System.out.println(roots[i]);
                myroot.add(roots[i].getPath());
            }
            request.getSession().setAttribute("RootDisk",myroot);
            getServletContext().getRequestDispatcher("/demo\\hello.jsp").forward(request,response);

            //重定向
//            response.sendRedirect("index.jsp?RootDisk="+myroot);

    }


}
