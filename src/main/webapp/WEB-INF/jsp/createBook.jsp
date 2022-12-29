<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Book</title>
</head>
<body>
<div>
    <form method="post" action="/create">
        <div>
            <label>ISBN</label>
            <input type="text" name="isbn">
        </div>
        <div>
            <label>Book Name</label>
            <input type="text" name="name">
        </div>
        <div>
            <label>Author</label>
            <input type="text" name="author">
        </div>
        <div>
            <label>Publish Date</label>
            <input type="text" name="publish_date">
        </div>
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>
