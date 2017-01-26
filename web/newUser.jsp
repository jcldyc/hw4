<%-- 
    Jacob Li
    This is the new user if no email was found to match page that is displayed when when the user hits "checkout" in cart.jsp

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>New User Page</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <h1>New User Registration</h1>   
    <form action="dBServlet" method="post">                          <%--sends the form to the servlet named dbservlet--%>
        <input type="hidden" name="action" value="newUser">         <%--set this to be a new user value--%>
        <label class="pad_top">Email:</label>
        <input type="email" name="email" value="${user.email}" 
               required><br>
        <label class="pad_top">Password:</label>
        <input type="password" name="password" value="${user.password}" 
               required><br>    
        <label class="pad_top">First Name:</label>
        <input type="text" name="firstName" value="${user.firstName}" 
               required><br> 
        <label class="pad_top">Last Name:</label>
        <input type="text" name="lastName" value="${user.lastName}" 
               required><br> 
        <label>&nbsp;</label>
        <input type="submit" value="Submit" class="margin_left">
    </form>
</body>
</html>
