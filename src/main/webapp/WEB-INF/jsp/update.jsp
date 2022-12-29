<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 12/29/2022
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<div>
    <form method="post" action="/update">
        <div>
            <label>ISBN</label>
            <input type="text" name="isbn">
        </div>
        <div>
            <label>Updated Book Name</label>
            <input type="text" name="name">
        </div>
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>
