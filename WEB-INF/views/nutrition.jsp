<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <meta charset="UTF-8">
    <title>Nutrition</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css2?family=Anton&family=Open+Sans&display=swap" rel="stylesheet">
    <link rel="shortcut icon" href="${contextPath}/resources/img/favicon.png" type="image/x-icon">
    <link rel="stylesheet" href="${contextPath}/resources/css/nutrition.css">

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<header id="header" class="header">
    <div class="container">
        <div class="nav">
            <ul class="menu">
                <li>
                    <a href="/AuthenticationApp_war_exploded/welcome">
                        Trainings
                    </a>
                </li>
                <li>
                    <a href="/AuthenticationApp_war_exploded/weight">
                        Weight diary
                    </a>
                </li>
                <li>
                    <a href="/AuthenticationApp_war_exploded/nutrition">
                        Nutrition
                    </a>
                </li>
            </ul>
            <button class="menu-open">
                <img src="img/menu.jpg" alt="Open menu">
            </button>
        </div>
        <div class="offer">
            <h1>
                Food diary
            </h1>
        </div>
    </div>
</header>
<section id="about" class="about">
    <div class="container">
        <h2>Meals</h2>
        <div id="nutrition-wrapper"></div>
        <div class="description">
            <div class="desc">
                <h4>Add</h4>
                <div>
                    <input type="text" placeholder="Record number" id="add-id">
                    <input type="text" placeholder="Name of the dish" id="add-name">
                    <input type="text" placeholder="Calories" id="add-calories">
                    <input type="text" placeholder="Date" id="add-date">
                    <button type="button" onclick="add()"> Add </button>
                    <br></br>
                </div>
                <h4>Edit</h4>
                <div>
                    <input type="text" placeholder="Record number" id="update-id">
                    <input type="text" placeholder="Name of the dish" id="update-name">
                    <input type="text" placeholder="Calories" id="update-calories">
                    <input type="text" placeholder="Date" id="update-date">
                    <button type="button" onclick="update()"> Edit </button>
                    <br></br>
                </div>

                <h4>Delete</h4>
                <div>
                    <input type="text" placeholder="Record number" id="remove-id">
                    <button type="button" onclick="remove()"> Delete </button>
                </div>
            </div>
        </div>

    </div>
</section>
<footer id="footer" class="footer">
    <div class="container">
        <div class="footer-text">
            <p>
                ??2021
            </p>
            <p>
                by Nikolaeva Ann
            </p>
        </div>
    </div>
</footer>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="${contextPath}/resources/js/main1.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
<script src="${contextPath}/resources/js/nutrition.js"></script>
</body>
</html>
