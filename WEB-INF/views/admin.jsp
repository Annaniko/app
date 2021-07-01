<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Admin</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
<div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="post" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <h2>Admin Page ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a>
        </h2>
    </c:if>
</div>
<hr/>
<h3>All users</h3>
<div id="users-wrapper">

</div>
<hr/>
<h3>Add</h3>
<div>
    <input type="text" placeholder="ID" id="add-id">
    <input type="text" placeholder="Username" id="add-name">
    <input type="text" placeholder="Password" id="add-taxi">
    <button type="button" onclick="add()"/>
</div>

<hr/>
<h3>Update</h3>
<div>
    <input type="text" placeholder="ID" id="update-id">
    <input type="text" placeholder="Username" id="update-name">
    <input type="text" placeholder="Password" id="update-taxi">
    <button type="button" onclick="update()"/>
</div>

<hr/>
<h3>Delete</h3>
<div>
    <input type="text" placeholder="ID" id="remove-id">
    <button type="button" onclick="remove()"/>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
<script src="${contextPath}/resources/js/admin.js"></script>
</body>

</html>