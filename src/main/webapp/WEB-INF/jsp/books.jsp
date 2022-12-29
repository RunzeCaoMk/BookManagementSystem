<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>books</title>
</head>

<body>
<h1>All the books</h1>
<table>
    <thead>
    <tr>
        <th>ISBN</th>
        <th>Name</th>
        <th>Author</th>
        <th>Publish Date</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book" varStatus="loop">
        <tr>
            <td>${book.isbn}</td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.publishDate}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>