<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<link rel="stylesheet" href="/css/style.css">

<h2>Employee List</h2>

<div class="top-bar">
    <a href="/add" class="add-btn">+ Add Employee</a>
</div>

<table>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Actions</th>
</tr>

<c:forEach var="e" items="${list}">
<tr>
    <td>${e.id}</td>
    <td>${e.name}</td>
    <td>${e.email}</td>
    <td>
        <a href="/edit/${e.id}">Edit</a>
        <a href="/delete/${e.id}" style="color:red;">Delete</a>
    </td>
</tr>
</c:forEach>
</table>