
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="../common/menu.jsp" %>
<h1>로그인폼</h1>
<form method="post" action="Login">
    <div>
        <label>아이디</label><br>
        <input type="text" name="username" />
    </div>
    <div>
        <label>비밀번호</label><br>
        <input type="password" name="password" />
    </div>
    <button type="submit">로그인</button>

</form>
</body>
</html>
