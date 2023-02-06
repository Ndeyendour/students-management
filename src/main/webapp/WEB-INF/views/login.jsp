<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
    <title>WELCOME TO TDSI</title>
    <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <!-- <link href="cap.css" rel="stylesheet"> -->
  
</head>

<body style="min-height: 100vh;display: flex; justify-content: center; align-items: center;">
    
    <div class="container" style="display: flex; justify-content: center; align-items: center;">
        <div class="card" style="width: 42rem;">
            <div class="card-body">
                <h1 class="card-title text-center">Login</h1>
                <h3 class="card-subtitle mb-2 text-muted text-center">Welcome to TDSI</h3>
                <br/>
                <% if(request.getAttribute("errorMessage") != null) { %>
                    <div class="alert alert-danger alert-dismissible fade show" role="alert">
                        <strong>${errorMessage}</strong> ${message}
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                <% } %>
                <p class="card-text">
                    <form action="/login.do" method="post">
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="basic-addon1"><i class='bx bxs-user'></i></span>
                            </div>
                            <input type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1" id="username" name="username">
                        </div>
                <br/>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="password-addon"><i class='bx bxs-lock-alt'></i></span>
                            </div>
                            <input type="password" class="form-control" placeholder="Password" aria-label="Password" aria-describedby="password-addon" name="password" id="password">
                        </div>
                        <button type="submit" class="btn btn-primary">Login</button>
                    </form>
                </p>
            </div>
        </div>
    </div>

    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="webjars/popper.js/2.9.3/umd/popper.js"></script>
    <script src="webjars/bootstrap/4.6.1/js/bootstrap.min.js"></script>

</body>
</html>