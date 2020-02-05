<%@page import="java.util.Calendar"%>
<%@ include file="header.jsp" %>
<% out.println("Date :"+Calendar.getInstance().getTime()); %>
</body>
</html>