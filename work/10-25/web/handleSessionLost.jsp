<%--
  Created by IntelliJ IDEA.
  User: zhangjianan
  Date: 2017/10/25
  Time: 下午8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="handleSessionLost.jsp" method="post">
    请输入书本：<input name="book" type="text">
    <input type="submit" value="添加到购物车">
</form>
<HR>
<%
    ArrayList books = (ArrayList)session.getAttribute("books");
    if(books==null){
        books = new ArrayList();
        session.setAttribute("books",books);
    }
    String book = request.getParameter("book");
    if (book!=null){
        book = new String(book.getBytes("ISO-8859-1"),"utf-8");
        books.add(book);
    }
%>
<%
    for (int i =0;i<books.size();i++){
        out.println(books.get(i) + "<BR>");
    }
%>
</body>
</html>
