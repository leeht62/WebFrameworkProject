<%--
  Created by IntelliJ IDEA.
  User: nykim
  Date: 2022/12/13
  Time: 12:55 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<p> <a href="${pageContext.request.contextPath}/coursedetail"> 학년별 이수 학점 조회</a></p>
<p> <a href="${pageContext.request.contextPath}/createregister"> 수강 신청</a></p>
<p> <a href="${pageContext.request.contextPath}/register?year=${2025}&semester=${2}"> 수강 신청 조회</a></p>
</body>
</html>
