

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Dictionary</title>
</head>
<body>
    <div>
        <div>
            <form action="/dictionary" method="post">
                English : <input type="text" name="english">
                <button type="submit" name="action" value="translate">Translate</button>
                <p>${vietnamese}</p>
            </form>
        </div>
    </div>
</body>
</html>
