<%@page import="com.entity.CommentsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setCharacterEncoding("utf-8");
	CommentsDTO commentsDTO = (CommentsDTO)request.getAttribute("commentsDTO");
	System.out.println("will sent to ajax: " + commentsDTO.toString() + "\n");
	
	int cmntidx = commentsDTO.getCmntIdx();
	String userid = commentsDTO.getUserId();
	String commented = commentsDTO.getCommented();
%>
<html>
<head>
</head>
<body>
<span class='writer-id' id="<%= userid %>"><%= userid %></span>
<span class='comment' id="<%= cmntidx %>"><%= commented %></span>
<span class='commentdelete' id="<%= cmntidx %>">삭제</span>
<span class='commentmodify' id="<%= cmntidx %>">수정</span>
</body>
</html>