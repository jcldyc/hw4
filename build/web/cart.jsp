<!--Jacob Li
HW3
This is the cart.jsp page.  It displays everything in the users cart at the time.
It also allows the user to update the amount of books and remove books as need.-->
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Cart!</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>

<h1>Your cart</h1>

<table>
  <tr>
    <th>Book Cover</th>
    <th class="right">Title</th>
    <th class="right">Price</th>
    <th class="right">Amount</th>
    <th class="right">Update</th>
    <th></th>
  </tr>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="var" items="${cart.stackArray}">
  <tr>
    <td class="right"><img src = "<c:out value='${var.book.url}'/>" style="width:104px;height:142px;"/></td>
    <td class="right">${var.book.name}</td>}
    <td class="right">${var.book.priceCurrencyFormat}</td>
    <td class="right">${var.totalCurrencyFormat}</td>
    <td>
      <form action="" method="post">
        <input type="hidden" name="abbr" 
               value="<c:out value='${var.book.abbr}'/>">
        <input type=text name="quantity" 
               value="<c:out value='${var.amount}'/>" id="quantity">
        <input type="submit" value="Update">
      </form>
    </td>
    <td>
      <form action="" method="post">
        <input type="hidden" name="abbr" 
               value="<c:out value='${var.book.abbr}'/>">
        <input type="hidden" name="quantity" 
               value="0">
        <input type="submit" value="Remove Item">
      </form>
    </td>
  </tr>
</c:forEach>
</table>

<p><b>To change the quantity</b>, enter the new quantity 
      and click on the Update button.</p>
  
<form action="" method="post">
  <input type="hidden" name="action" value="shop">
  <input type="submit" value="Continue Shopping">
</form>

<form action="" method="post">
  <input type="hidden" name="action" value="checkout">
  <input type="submit" value="Checkout">
</form>

</body>
</html>