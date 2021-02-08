<%-- 
    Document   : editnote
    Created on : Feb 5, 2021, 6:51:04 PM
    Author     : 829364
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <form method="post" action="note">
            <p>Title: <input type="text" name="conedit" value="${note.title}"></p>
            <p>Contents: <textarea name="headeredit">${note.con}</textarea></p>
            <input type="submit" value="save">
        </form>
    </body>
</html>
