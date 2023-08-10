<%@page import="carRentalManagementSystem.controller.JWAView"%>
<%@page import="main.java.com.carrental.util.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .card {
            max-width: 400px;
            margin: 100px auto;
            padding: 20px;
        }
    </style>
</head>



  		
<body>
    <div class="container">
        <div class="card">
            <div class="text-center">
            <h3>  Admin Login</h3> 
            <h3 style="color: red;" class="text-center">
            <% //String userSession = session.getAttribute("user").toString(); %>
         	 <%=ServletUtility.getErrorMessage(request) %>
            </h3>
            <h3 style="color: green;" class="text-center">
            <%=ServletUtility.getSuccessMessage(request) %>
            </h3>
          </div>
            <form action="${pageContext.request.contextPath}/LoginServlet" method="post">

                <div class="form-group">
                    <label for="username">Username</label>
                    <input type="text" class="form-control" name="username" id="username" required>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" name="password" id="password" required>
                </div>
                <button type="submit" class="btn btn-primary btn-block">Login</button>
            </form>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>