<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>
    <!-- Admin Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Car Rental System - Admin Dashboard</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="admin_dashboard.html">Dashboard</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="car_listings.html">Car Listings</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="reports.html">Reservations</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="users.html">Users</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="reports.html">Reports</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="settings.html">Settings</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="admin_login.html">Logout</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>


    <!-- Settings Content -->
    <div class="container mt-4">
        <h2 class="mb-4">Settings</h2>

        <!-- Admin Profile -->
        <div class="card mb-4">
            <div class="card-body">
                <h5 class="card-title">Admin Profile</h5>
                <form>
                    <div class="form-group">
                        <label for="username">Username</label>
                        <input type="text" class="form-control" id="username" value="admin123">
                    </div>
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" id="password">
                    </div>
                    <button type="submit" class="btn btn-primary">Update Profile</button>
                </form>
            </div>
        </div>

        <!-- Email Configuration -->
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Email Configuration</h5>
                <form>
                    <div class="form-group">
                        <label for="smtpServer">SMTP Server</label>
                        <input type="text" class="form-control" id="smtpServer" value="smtp.example.com">
                    </div>
                    <div class="form-group">
                        <label for="emailUsername">Email Username</label>
                        <input type="text" class="form-control" id="emailUsername" value="admin@example.com">
                    </div>
                    <div class="form-group">
                        <label for="emailPassword">Email Password</label>
                        <input type="password" class="form-control" id="emailPassword">
                    </div>
                    <button type="submit" class="btn btn-primary">Save Configuration</button>
                </form>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
