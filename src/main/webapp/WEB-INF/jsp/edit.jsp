<link rel="stylesheet" href="/css/style.css">

<div class="container">
    <h2>Edit Employee</h2>

    <form action="/save" method="post">
        <input type="hidden" name="id" value="${emp.id}"/>

        <input type="text" name="name" value="${emp.name}" required/>
        <input type="email" name="email" value="${emp.email}" required/>

        <button type="submit">Update</button>
    </form>
</div>