<html>

<head>
<title>Simple Web Application</title>
</head>
    <center>
<h1>Welcome to Spring Boot Login Page</h1>

<h2>Login To Proceed</h2>
<h2>${errorMsg}</h2>
<form method="post">
    User Name : <input type="text" name="username" /><br><br>
    Password  : <input type="password" name="password" /><br><br>
    <input type="submit" value="Login"/>
</form>
</center>
</body>
</html>