<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>수강 과목 목록</title>
    <style>
        table {
            width: 90%;
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
        h2 {
            text-align: center;
        }
    </style>
</head>
<body>

<h2>전체 수강 과목 목록</h2>

<table>
    <thead>
    <tr>
        <th>수강년도</th>
        <th>학기</th>
        <th>교과코드</th>
        <th>교과목명</th>
        <th>교과구분</th>
        <th>담당교수</th>
        <th>학점</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="courses" items="${courses}">
        <tr>
            <td>${courses.year}</td>
            <td>${courses.semester}</td>
            <td>${courses.code}</td>
            <td>${courses.title}</td>
            <td>${courses.major}</td>
            <td>${courses.professor}</td>
            <td>${courses.credit}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>