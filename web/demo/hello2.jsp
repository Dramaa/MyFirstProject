<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/16
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome！222</title>
</head>
<body>
<%
    List<String> list= (List<String>)request.getSession().getAttribute("SonDisk");
    List<String> list2= (List<String>)request.getSession().getAttribute("PathPath");
    String thisPath= (String) request.getSession().getAttribute("ThisPath");

    if(list!=null){
        String gdq="";
        String gdq2="";
        for(int i=0;i<list.size();i++){
//            request.getSession().setAttribute("index",i);
            gdq=list.get(i);
            gdq2=list2.get(i);

            String asd=java.net.URLEncoder.encode(gdq2,"utf-8");


%>
<a href="/como?str=<%=asd%>"><%=gdq%></a><br>
<%
            }
        %>
<h2>您当前的位置是：<%=thisPath%></h2>
<%

    }
%>

</body>
</html>
