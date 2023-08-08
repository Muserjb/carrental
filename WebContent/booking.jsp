<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Booking</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>
    <!-- Navbar -->
    <!-- Add Navbar code here -->

    <!-- Booking Content -->
    <div class="container mt-4">
        <h2 class="mb-4">Car Booking</h2>

        <!-- Search Form -->
        <form>
            <!-- Add search form fields here (e.g., pickup date, return date, car type) -->
            <button type="submit" class="btn btn-primary">Search</button>
        </form>

        <!-- Car Listings -->
        <div class="row mt-4">
            <!-- Sample Car Listing Card (Repeat this for each car) -->
            <div class="col-md-4 mb-4">
                <div class="card">
                    <img src="https://via.placeholder.com/300" class="card-img-top" alt="Car">
                    <div class="card-body">
                        <h5 class="card-title">Car Name</h5>
                        <p class="card-text">Make: Toyota</p>
                        <p class="card-text">Type: Sedan</p>
                        <p class="card-text">Year: 2021</p>
                        <p class="card-text">Price: $50/day</p>
                        <a href="view_detail.html" >View Details</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
