<html>

<head>
<link rel="stylesheet" href="/css/style.css">
<title>Simple Web Application</title>
</head>
    <center>
<h1>Registration</h1>

<h2>Register yourself</h2>
<form method="post">
    <label class="my-label">UserName : </label> <input type="text" name="username" class="styled-textbox" /><br><br>
    <label class="my-label">Password  : </label> <input type="password" name="password" class="styled-textbox" /><br><br>
    <input type="submit" value="Register" class="my-button" />
</form>
<br><br>
<h2 class="h2-error">${UsernameExistsError}</h2>
</center>
</body>
</html>