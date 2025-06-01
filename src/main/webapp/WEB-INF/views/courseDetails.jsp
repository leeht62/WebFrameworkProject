<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Course Details</title>
  <style>
    table {
      width: 80%;
      border-collapse: collapse;
      margin: 30px auto;
    }
    th, td {
      border: 1px solid #aaa;
      padding: 10px;
      text-align: center;
    }
    th {
      background-color: #f2f2f2;
    }
    a {
      text-decoration: none;
      color: blue;
    }
  </style>
</head>
<body>

<h2 style="text-align:center;">수강 상세 정보</h2>

<table>
  <thead>
  <tr>
    <th>년도</th>
    <th>학기</th>
    <th>취득 학점</th>
    <th>상세보기</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="detail" items="${courseDetail}">
    <tr>
      <td>${detail.year}</td>
      <td>${detail.semester}</td>
      <td>
        <c:choose>
          <c:when test="${not empty detail.courses}">
            <c:set var="totalCredit" value="0" />
            <c:forEach var="course" items="${detail.courses}">
              <c:set var="totalCredit" value="${totalCredit + course.credit}" />
            </c:forEach>
            ${totalCredit}
          </c:when>
          <c:otherwise>0</c:otherwise>
        </c:choose>
      </td>
      <td>
        <a href="/information/detailfind?year=${detail.year}&semester=${detail.semester}">상세보기</a>
      </td>

    </tr>
  </c:forEach>
  </tbody>
</table>

</body>
</html>