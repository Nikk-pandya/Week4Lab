<%-- 
    Document   : viewnote
    Created on : Feb 5, 2021, 6:50:46 PM
    Author     : 829364
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Note</h1>
        <h2>View Note</h2>
        <p>Title:
         ${note.title}</p>
        <p>Contents:
        ${note.con}</p>
        <a href="note?edit=true">Edit</a>
    </body>
</html>

