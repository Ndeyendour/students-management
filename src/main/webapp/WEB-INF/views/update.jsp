<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<%@page import="model.Student" %>
<!DOCTYPE html>
<html>
<head>
<title>WELCOME TO TDSI</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
 
<style>
        i.bx {
            font-size: 24px;
        }
        i.bx-check-double {
            color: green;
        }
        i.bx-x {
            color: red;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/welcome.do">TDSI</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="/welcome.do">Home</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/students.do">Students</a>
            </li>
        </ul>
        <span class="navbar-text">
              <a href="/logout.do" class="btn btn-danger text-white">Logout</a>
            </span>
    </div>
</nav>
<br>
<div class="container">
    <%--New Student form --%>
    <%Student student = (Student) request.getAttribute("student");%>
    <form action="students.do" method="post">
        <div class="row">
            <div class="form-group col">
                <label for="firstname">Firstname</label>
                <input type="text" class="form-control" name="firstname" id="firstname" value="<%=student.getFirstname()%>" />
            </div>
            <div class="form-group col">
                <label for="lastname">lastname</label>
                <input type="text" class="form-control" name="lastname" id="lastname" value="<%=student.getLastname()%>" />
            </div>
            <div class="form-group col">
                <label for="dateOfBirth">dateOfBirth</label>
                <input type="date" class="form-control" name="dateOfBirth" id="dateOfBirtht" value="<%=student.getDateOfBirth()%>" />
            </div>
            <div class="form-group col">
                <label for="registrationDate">registration</label>
                <input type="date" class="form-control" name="registrationDate" id="registrationDate" value="<%=student.getRegistrationDate()%>" />
            </div>
        </div>
        <button class="btn btn-warning" >Update</button>
    </form>

    <% List<Student> students = (List<Student>) request.getAttribute("students"); %>
    <hr class="my-5"/>
    <div class="table-responsive">
        <table class="table table-hover table-borderless">
            <thead class="thead-dark">
            <tr>
                
                <th scope="col" class="text-center">firstname</th>
                <th scope="col" class="text-center">lastname</th>
                <th scope="col" class="text-center">dateOfBirth</th>
                <th scope="col" class="text-center">Registration</th>
                <th scope="col" class="text-center">Actions</th>
            </tr>
            </thead>
            <tbody>
            <% for(Student t : students) { %>
            <tr>
                <td class="text-center"><%= t.getFirstname() %></td>
                <td class="text-center"><%= t.getLastname() %></td>
                <td class="text-center"><%= t.getDateOfBirth() %></td>
                <td class="text-center"><%= t.getRegistrationDate() %></td>
                <td class="text-center">
                    
                </td>
                <td class="text-center">
                    <a class="btn btn-warning" href="/update-student.do?firstname=<%=t.getFirstname()%>">Update</a>
                    <a class="btn btn-danger" href="/delete-student.do?firstname=<%=t.getFirstname()%>">Delete</a>
                   
                </td>
            </tr>
            <% } %>
            </tbody>
        </table>
    </div>
</div>

<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/popper.js/2.9.3/umd/popper.js"></script>
<script src="webjars/bootstrap/4.6.1/js/bootstrap.min.js"></script>

</body>
</html>