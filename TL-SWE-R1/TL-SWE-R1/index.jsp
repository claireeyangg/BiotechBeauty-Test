<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    // Randomly assign user to A or B variation
    String variation = (Math.random() < 0.5) ? "A" : "B";
    if ("A".equals(variation)) {
        response.sendRedirect("landing_a.jsp");
    } else {
        response.sendRedirect("landing_b.jsp");
    }
%>
