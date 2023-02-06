<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<!DOCTYPE html>
<html>
<head>
<title>WELCOME TO TDSI </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <!-- <link href="cap.css" rel="stylesheet"> -->
  
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="/welcome.do">TDSI</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/welcome.do">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/students.do">students</a>
                </li>
            </ul>
            <span class="navbar-text">
              <a href="/logout.do" class="btn btn-danger text-white">Logout</a>
            </span>
        </div>
    </nav>
        <div class="container">
            <div class="jumbotron">
                <% String username = (String) request.getSession().getAttribute("username"); %>
                <h1 class="display-4">Welcome back, <%=username%></h1>
                <p class="lead">
                    Welcome to  Student management application 
                </p>
                <hr class="my-4"/>
                <p>
                    List of six month
                </p>
                
                <a class="btn btn-lg btn-outline-danger" href="/students.do">Click here</a>
                <br>
                <br>
                <p>
                    List of twelve month
                </p>
                <a class="btn btn-lg btn-outline-danger" href="/students.do">Click here</a>
                
            </div>
        </div>

        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
        <script src="webjars/popper.js/2.9.3/umd/popper.js"></script>
        <script src="webjars/bootstrap/4.6.1/js/bootstrap.min.js"></script>
</body>
</html>