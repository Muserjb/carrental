
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Details</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>
    <!-- Navbar -->
    <!-- Add Navbar code here -->

    <!-- Car Details Content -->
    <div class="container mt-4">
        <h2 class="mb-4">Car Details</h2>

        <div class="card mb-4">
            <img src="https://via.placeholder.com/300" class="card-img-top" alt="Car">
            <div class="card-body">
                <h5 class="card-title">Car Name</h5>
                <p class="card-text">Make: Toyota</p>
                <p class="card-text">Type: Sedan</p>
                <p class="card-text">Year: 2021</p>
                <p class="card-text">Price: $50/day</p>
                <p class="card-text">Description: Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc
                    placerat, sem id euismod aliquam, nibh quam ullamcorper nibh, quis consectetur elit quam eu nisi.</p>
                <a href="#"  class="btn btn-primary btn-block" data-toggle="modal" data-target="#reservationModal" class="btn btn-primary">Reserve Now</a>
            </div>
        </div>



        
<!-- Reservation Modal -->
<div class="modal fade" id="reservationModal" tabindex="-1" role="dialog" aria-labelledby="reservationModalLabel"
aria-hidden="true">
<div class="modal-dialog" role="document">
    <div class="modal-content">
        <div class="modal-header">
            <h5 class="modal-title" id="reservationModalLabel">Reservation Form</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>
        <div class="modal-body">
            <form>
                <div class="form-group">
                    <label for="fullName">Full Name</label>
                    <input type="text" class="form-control" id="fullName" required>
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" id="email" required>
                </div>
                <div class="form-group">
                    <label for="phone">Phone</label>
                    <input type="tel" class="form-control" id="phone" required>
                </div>
                <div class="form-group">
                    <label for="pickupDate">Pickup Date</label>
                    <input type="date" class="form-control" id="pickupDate" required>
                </div>
                <div class="form-group">
                    <label for="returnDate">Return Date</label>
                    <input type="date" class="form-control" id="returnDate" required>
                </div>
                <button type="submit" class="btn btn-primary btn-block">Confirm Reservation</button>
            </form>
        </div>
    </div>
</div>
</div>






        <div class="mt-4">
            <a href="booking.html" class="btn btn-secondary">Back to Car Listings</a>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
