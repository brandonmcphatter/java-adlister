<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="partials/head.jsp" %>
    <title>Pick A Color</title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>

<h1 class="text-center">Welcome to "YOUR FAVORITE COLOR"</h1>
<div class="container text-center">
    <form action="/viewcolor" method="POST">
        <div>
            <label for="favcolor">Enter Your Favor Color:</label>
            <input class="ms-4" type="text" class="form-control-plaintext" id="favcolor" name="usercolor">
        </div>
        <div>
            <button type="submit" class="btn btn-primary mb-3">Submit</button>
        </div>
    </form>
</div>

<%@include file="partials/scripts.jsp" %>
</body>
</html>