<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>2025학년도 2학기 수강신청</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>

<h2>2025학년도 2학기 수강신청</h2>

<sf:form method="post" action="${pageContext.request.contextPath}/docreate" modelAttribute="courses">
    <table class="formtable">
        <tr>
            <td class="label">교과목명:</td>
            <td><sf:input class="control" type="text" path="title"/> <br/>
                <sf:errors path="title" class="error"/>
            </td>
        </tr>

        <tr>
            <td class="label">교과코드:</td>
            <td><sf:input class="control" type="text" path="code"/> <br/>
                <sf:errors path="code" class="error"/>
            </td>
        </tr>

        <tr>
            <td class="label">교과구분:</td>
            <td><sf:input class="control" type="text" path="major"/> <br/>
                <sf:errors path="major" class="error"/>
            </td>
        </tr>

        <tr>
            <td class="label">담당교수:</td>
            <td><sf:input class="control" type="text" path="professor"/> <br/>
                <sf:errors path="professor" class="error"/>
            </td>
        </tr>

        <tr>
            <td class="label">학점:</td>
            <td><sf:input class="control" type="number" path="credit"/> <br/>
                <sf:errors path="credit" class="error"/>
            </td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="과목 등록"/> </td>
        </tr>
    </table>
</sf:form>

</body>
</html>