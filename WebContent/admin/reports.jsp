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




    <!-- Reports Content -->
    <div class="container mt-4">
        <h2 class="mb-4">Reports</h2>

        <!-- Report Options -->
        <form>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <select class="form-control">
                        <option selected disabled>Select Report Type</option>
                        <option value="sales">Sales Report</option>
                        <option value="inventory">Inventory Report</option>
                        <!-- Add more options here -->
                    </select>
                </div>
                <div class="form-group col-md-3">
                    <input type="date" class="form-control" placeholder="Start Date">
                </div>
                <div class="form-group col-md-3">
                    <input type="date" class="form-control" placeholder="End Date">
                </div>
                <div class="form-group col-md-3">
                    <button type="submit" class="btn btn-primary btn-block">Generate Report</button>
                </div>
            </div>
        </form>

        <!-- Display Report Results -->
        <div class="mt-4">
            <!-- Add chart or table to display report results here -->
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
