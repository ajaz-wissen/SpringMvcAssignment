<html>

<head>
<link rel="stylesheet" href="/css/style.css">
<title>Simple Web Application</title>
</head>
    <center>
<h1>Welcome to Spring Boot Login Page</h1>

<h2>Login To Proceed</h2>
<h2 class="h2-error">${errorMsg}</h2>
<form method="post">
    <label class="my-label">UserName : </label> <input type="text" name="username" class="styled-textbox" /><br><br>
    <label class="my-label">Password  : </label> <input type="password" name="password" class="styled-textbox" /><br><br>
    <input type="submit" value="Login" class="my-button"/>
</form>
</center>
</body>
</html>