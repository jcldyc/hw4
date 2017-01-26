<!--Jacob Li
Hw4
This is the checkout.jsp page.  This is what the user see's at the very end of 
their shopping session-->


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Check Me Out</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>

<h1>Thank You!</h1>
<p>Email:   ${user.email} </p>
<p>First Name:   ${user.firstName} </p>
<p>Last Name:   ${user.lastName} </p>

<table>
  <tr>
    <th>Book Cover</th>
    <th class="right">Title</th>
    <th class="right">Price</th>
    <th class="right">Amount</th>
    <th class="right">Quantity</th>
  </tr>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="var" items="${cart.stackArray}">
  <tr>
    <td class="right"><img src = "<c:out value='${var.book.url}'/>" style="width:104px;height:142px;"/></td>
    <td class="right">${var.book.name}</td>}
    <td class="right">${var.book.priceCurrencyFormat}</td>
    <td class="right">${var.totalCurrencyFormat}</td>
    <td class="right">${var.amount}</td>
  </tr>
</c:forEach>
  <tr>
      <td>Total</td>
      <td></td>
      <td></td>
      <td class="right">${cart.getTotalAmount()}</td>
  </tr>
</table>

<p>To keep shopping, please hit the "Continue Shopping" button below.</p>
  
<form action="cart" method="post">
  <input type="hidden" name="action" value="">
  <input type="submit" value="Continue Shopping">
</form>



</body>
</html>