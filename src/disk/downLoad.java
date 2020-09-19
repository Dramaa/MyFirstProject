package disk;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class downLoad {

 public HttpServletResponse download(String path, HttpServletResponse response) {
           try {
                   // path是指欲下载的文件的路径。
                   File file = new File(path);
                   // 取得文件名。
                   String filename = file.getName();
                  // 取得文件的后缀名。
                   String ext = filename.substring(filename.lastIndexOf(".") + 1).toUpperCase();

                   // 以流的形式下载文件。
                   InputStream fis = new BufferedInputStream(new FileInputStream(path));
                   byte[] buffer = new byte[fis.available()];
                   fis.read(buffer);
                   fis.close();
                   // 清空response
                   response.reset();
                   // 设置response的Header
                   response.addHeader("Content-Disposition", "attachment;filename=" + new String(filename.getBytes(),"ISO8859-1"));
                   response.addHeader("Content-Length", "" + file.length());
                   OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
                   response.setContentType("application/octet-stream");
                   toClient.write(buffer);
                   toClient.flush();
                   toClient.close();
                 } catch (IOException ex) {
                   ex.printStackTrace();
                }

             return response;
           }

           public void downloadLocal(HttpServletResponse response) throws FileNotFoundException, UnsupportedEncodingException {
             // 下载本地文件
             String fileName = "Operator.doc".toString(); // 文件的默认保存名
             // 读到流中
             InputStream inStream = new FileInputStream("D:\\wodeweizhi");// 文件的存放路径
            // 设置输出的格式
             response.reset();
               response.setContentType("bin");
             response.addHeader("Content-Disposition", "attachment; filename=\"" +java.net.URLEncoder.encode(fileName,"UTF-8") + "\"");
             // 循环取出流中的数据
             byte[] b = new byte[100];
             int len;
             try {
                   while ((len = inStream.read(b)) > 0)
                        response.getOutputStream().write(b, 0, len);
                  inStream.close();
                } catch (IOException e) {
                   e.printStackTrace();
                }
           }



}
