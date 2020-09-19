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
    <title>Welcome！</title>
</head>
<body>
<%
    List<String> list= (List<String>)request.getSession().getAttribute("RootDisk");
    if(list!=null){

        for(int i=0;i<list.size();i++){
            String gdq=list.get(i);
            String asd=java.net.URLEncoder.encode(gdq,"utf-8");

%>

<a href="/como?str=<%=asd%>"><%=gdq%></a><br>

<%
            }
    }
%>
</body>
</html>
