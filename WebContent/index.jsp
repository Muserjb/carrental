
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Rental Management System</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .card {
            margin-bottom: 20px;
        }
    </style>
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Car Rental System</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#home">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="booking.jsp">Booking</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#about">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#services">Services</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#contact">Contact</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="admin/admin_login.jsp">Login</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <header id="home" class="bg-light text-center py-5">
        <div class="container">
            <h1 class="display-4">Welcome to Car Rental System</h1>
            <p class="lead">Rent your dream car with us!</p>
        </div>
    </header>

    <section id="about" class="py-5">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <h2 class="display-4">About Us</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis a scelerisque purus. Vestibulum
                        consequat turpis nec interdum cursus. In hac habitasse platea dictumst. Nullam eu euismod nibh.
                        Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.
                        Suspendisse fringilla finibus tellus sit amet consectetur.</p>
                </div>
                <div class="col-lg-6">
                    <img src="car3.jpg" class="img-fluid rounded-circle" alt="About Us">
                </div>
            </div>
        </div>
    </section>

    <section id="services" class="bg-light py-5">
        <div class="container">
            <h2 class="display-4 text-center">Our Services</h2>
            <div class="row">
                <div class="col-md-4">
                    <div class="card">
                        <img src="cars1.jpg" class="card-img-top" alt="Car Rental">
                        <div class="card-body">
                            <h5 class="card-title">Car Rental</h5>
                            <p class="card-text">Rent a variety of cars for short or long term usage. We have a wide
                                range of options to suit your needs and budget.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <img src="cars1.jpg" class="card-img-top" alt="Car Leasing">
                        <div class="card-body">
                            <h5 class="card-title">Car Leasing</h5>
                            <p class="card-text">Lease a car for a fixed period of time. Enjoy the benefits of a new
                                car without the commitment of ownership.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <img src="cars1.jpg" class="card-img-top" alt="Airport Transfer">
                        <div class="card-body">
                            <h5 class="card-title">Airport Transfer</h5>
                            <p class="card-text">We offer airport transfer services to ensure a smooth and convenient
                                journey to your destination.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section id="contact" class="py-5">
        <div class="container">
            <h2 class="display-4 text-center">Contact Us</h2>
            <div class="row">
                <div class="col-md-6">
                    <form>
                        <div class="form-group">
                            <label for="name">Name</label>
                            <input type="text" class="form-control" id="name" required>
                        </div>
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="email" class="form-control" id="email" required>
                        </div>
                        <div class="form-group">
                            <label for="message">Message</label>
                            <textarea class="form-control" id="message" rows="4" required></textarea>
                        </div>
                        <button type="submit" class="btn btn-primary btn-block">Submit</button>
                    </form>
                </div>
                <div class="col-md-6">
                    <ul class="list-group">
                        <li class="list-group-item"><strong>Address:</strong> 123 Car Rental Street, City, Country
                        </li>
                        <li class="list-group-item"><strong>Phone:</strong> +123 456 7890</li>
                        <li class="list-group-item"><strong>Email:</strong> musajb0003@gmail.com</li>
                    </ul>
                </div>
            </div>
        </div>
    </section>

    <footer class="bg-dark text-white text-center py-3">
        <p> Develop with love and fashion by musausman &copy; 2023.</p>
    </footer>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
