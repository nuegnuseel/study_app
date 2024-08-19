<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%@ include file="common/menu.jsp" %>
<h1>홈 페이지</h1>
<%--
	public String index(Model model) {

		model.addAttribute("message", "홈페이지 방문을 환영합니다.");

		return "index";
	}
 --%>
<p>${message}</p>

</body>
</html>