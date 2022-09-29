<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogIn Form</title>
<style type="text/css">

/* Bordered form */
form {
  border: 3px solid #f1f1f1;
  /*Make the form in center place, using max-width:500px and margin:auto; */
  max-width: 600px;
  margin: auto;
 
}

/* Full-width inputs */
input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

/* Set a style for all buttons */
button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

/* Add a hover effect for buttons */
button:hover {
  opacity: 0.8;
}

/* Extra style for the cancel button (red) */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Add padding to containers */
.container {
  padding: 16px;
}

/* The "Forgot password" text */
span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
    display: block;
    float: none;
  }
  .cancelbtn {
    width: 100%;
  }
}

</style>
</head>


<body>
<form action="Login.html" method="post">

<fieldset>
<div class="container">

   <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required> <br><br>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required><br><br>

    <button type="submit">Login</button> <br>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
  <hr>

  <div class="container" style="background-color:#f1f1f1">
    
    <span class="psw">Forgot <a href="#">password?</a></span>  
  </div>

</fieldset>
  
</form>
</body>
</html>