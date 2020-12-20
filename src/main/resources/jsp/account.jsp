<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
            crossorigin="anonymous"></script>
    <meta charset="UTF-8">
    <title>Account</title>
</head>
<body>
<div class="container">

    <ul class="nav nav-pills">
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
               role="button" aria-haspopup="true" aria-expanded="false">My profile</a>
            <div class="dropdown-menu">

                <div data-spy="scroll" data-target="#list-example" data-offset="0" class="scrollspy-example">
                    <h4 id="list-item-1" align="center">Info:</h4>
                    <p align="center"> My login - <%= request.getSession().getAttribute("login")%> !</p>
                    <p align="center"> My password - <%= request.getSession().getAttribute("password")%> !</p>
                    <p align="center"> My id - <%= request.getSession().getAttribute("id")%> !</p>
                </div>

            </div>
        </li>
    </ul>
    <div class="jumbotron jumbotron-fluid">
        <div class="container">
            <h1 class="display-4" align="center">   Welcome, <%= request.getSession().getAttribute("login")%> !!!
            </h1>
        </div>
    </div>
</div>
</body>
</html>
