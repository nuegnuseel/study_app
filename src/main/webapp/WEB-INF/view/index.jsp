<%--
  Created by IntelliJ IDEA.
  User: jhta
  Date: 2024-08-13
  Time: 오후 7:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>홈페이지</h1>
<%--public String index(Model model) {model.addAttribute("message","홈페이지 방문을 환영합니다.");--%>
<%--return "index";--%>
<p>${message}</p>
<h3>메뉴</h3>
<ul>
    <li><a href="/user/register">회원가입</a> </li>
    <li><a href="/login">로그인</a> </li>
    <li><a href="/logout">로그아웃</a> </li>
</ul>
</body>
</html>
