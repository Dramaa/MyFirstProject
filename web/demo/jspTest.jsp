<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/18
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>luv</title>
</head>
<body>
<%
  // String mya=(String)getServletConfig().getServletContext().getAttribute("myParam");
   //String mya1=(String)request.getAttribute("myParam");
    String strSession = (String)request.getSession().getAttribute("myParam1");


%>
<!--
<text value="${mya}"/>
<text value="${mya1}"/>
<text value="${cs}"/>-->
<p>用session获得属性值：<%=strSession%>> </p>
</body>
</html>
