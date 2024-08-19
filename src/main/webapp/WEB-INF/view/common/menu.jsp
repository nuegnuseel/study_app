<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div>
    <sec:authorize access="isAuthenticated()">
        <strong><sec:authentication property="name"/>님 환영합니다. </strong>
    </sec:authorize>
    <h3>메뉴</h3>
    <ul>
        <li><a href="/">홈</a></li>

        <sec:authorize access="hasRole('ADMIN')">
            <li><a href="/admin">관리자</a></li>
        </sec:authorize>

        <sec:authorize access="!isAuthenticated()">
            <li><a href="/user/register">회원가입</a></li>
            <li><a href="/user/login">로그인</a></li>
        </sec:authorize>

        <sec:authorize access="isAuthenticated()">
            <li><a href="/user/logout">로그아웃</a></li>
        </sec:authorize>
    </ul>
</div>