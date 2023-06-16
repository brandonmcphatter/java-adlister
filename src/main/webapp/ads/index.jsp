<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title}</title>
</head>
<body>
<h1>This is the ads jsp</h1>
<p>Ads should show here:</p>
<div class="container">
<c:forEach items="${ads}" var="ad">
    <h3>${ad.title}</h3>
    <h4>${ad.description}</h4>
</c:forEach>
</div>
</body>
</html>
