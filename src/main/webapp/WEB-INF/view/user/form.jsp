<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%@ include file="../common/menu.jsp" %>

<h1>회원가입폼</h1>
<form:form method="post" action="register" modelAttribute="userRegisterForm">
    <div>
        <label>아이디</label>
        <form:input type="text" path="username" /><br>
        <form:errors path="username" cssStyle="color:red;"></form:errors>
    </div>

    <div>
        <label>비밀번호</label>
        <form:input type="text" path="password" /><br>
        <form:errors path="password" cssStyle="color:red;"></form:errors>
    </div>

    <div>
        <label>닉네임</label>
        <form:input type="text" path="nick" /><br>
        <form:errors path="nick" cssStyle="color:red;"></form:errors>
    </div>

    <div>
        <label>이메일</label>
        <form:input type="text" path="email" /><br>
        <form:errors path="email" cssStyle="color:red;"></form:errors>
    </div>

    <button type="submit">가입</button>
</form:form>
</body>
</html>