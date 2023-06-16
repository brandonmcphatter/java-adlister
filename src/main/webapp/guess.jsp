<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <%@ include file="partials/head.jsp" %>
  <title>Guess A Number</title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<div class="container d-flex flex-column align-items-center justify-content-center">
  <p class="">Guess a number from 1 to 3 🙃</p>
  <form class="" action="/guess" method="POST">
    <select class="form-select" name="user-choice" >
      <option selected>Good Luck!</option>
      <option value="1">One</option>
      <option value="2">Two</option>
      <option value="3">Three</option>
    </select>
    <div>
      <button type="submit" class="btn btn-primary mb-3">Submit</button>
    </div>
  </form>
</div>


<%@include file="partials/scripts.jsp" %>
</body>
</html>
