<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
</head>
<body>
    <header>
        <h1>Login</h1>
    </header>
        <form action="/mvc/login" method="POST">
                <label for="name">Username:</label>
                <input type="text" name="name" required value="${name}">
                <label for="password">Password:</label>
                <input type="password" name="password" required value="${password}">
                <button type="submit" value="submit">Submit</button>
        </form>
        <p>${errorMessage}</p>
</body>
</html>
