<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (request.getMethod().equals("POST")) {
        if (username.equals("Admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        } else {
            response.sendRedirect("/login.jsp");
        }
    }
%>
<html>
<head>
    <%@ include file="partials/head.jsp" %>
    <title>Login</title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<div class="container w-50">
    <form action="login.jsp" method="POST">
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" name="username" class="form-control" id="username" aria-describedby="emailHelp"
                   placeholder="Enter Username">
            <small id="emailHelp" class="form-text text-muted">We'll never share your username with anyone else.</small>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="Password">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
