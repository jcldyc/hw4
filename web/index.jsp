<!--Jacob Li
HW3
This is the index.jsp page.  It is the first page the user sees when it sends 
a request initially.  It holds a standard form table that allows the user
to add one book to the cart.-->
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>HW 3: Jacob Li</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    
<h1>Book Order Form</h1>
<table>
    <tr>
        <th>Cover</th>
        <th class="right">Title</th>
        <th class="right">Price</th>
        <th>&nbsp;</th>
    </tr>
    <tr>
        <td><img src="http://blogs.rep-am.com/special/files/2015/07/01_fea_fear-and-loathing.jpg" 
                 alt="Hunter S. Thompson" style="width:104px;height:142px;"></td>
        <td class="right">Fear and Loathing in Las Vegas (First Edition)</td>
        <td class="right">$749.99</td>
        <td><form action="cart" method="post">
                <input type="hidden" name="abbr" value="FALV">
                <input type="submit" value="Add To Cart">
            </form></td>
    </tr>
    <tr>
        <td><img src="https://images-na.ssl-images-amazon.com/images/I/41rMcW9CloL._SX331_BO1,204,203,200_.jpg" 
                 alt="Don't mess with the sun." style="width:104px;height:142px;"></td>
        <td class="right">The Art of War</td>
        <td class="right">$11.99</td>
        <td><form action="cart" method="post">
                <input type="hidden" name="abbr" value="TAOW">
                <input type="submit" value="Add To Cart">
            </form></td>
    </tr>
    <tr>
        <td><img src="http://i.ebayimg.com/images/g/ueUAAOSwOVpXXroc/s-l1600.jpg" 
                 alt="You're a wizard Harry." style="width:104px;height:142px;"></td>
        <td class="right">"The Harry Potter Collection</td>
        <td class="right">$14.95</td>
        <td><form action="cart" method="post">
                <input type="hidden" name="abbr" value="HPCF">
                <input type="submit" value="Add To Cart">
            </form></td>
    </tr>
    <tr>
        <td><img src="https://images-na.ssl-images-amazon.com/images/I/51U5Ch2PioL._SX346_BO1,204,203,200_.jpg" 
                 alt="Be one." style="width:104px;height:142px;"></td>
        <td class="right">The Shaolin Grandmasters' Text: History, 
                          Philosophy, and Gung Fu of Shaolin Ch'an</td>
        <td class="right">$42.49</td>
        <td><form action="cart" method="post">
                <input type="hidden" name="abbr" value="SGMT">
                <input type="submit" value="Add To Cart">
            </form></td>
    </tr>
    <tr>
        <td> <img src="https://upload.wikimedia.org/wikipedia/en/5/5a/Action_Comics_1.jpg" 
                  alt="This comic is too expensive!" style="width:104px;height:142px;"></td>
        <td class="right">Action Comics No. 1</td>
        <td class="right">$1,000,000</td>
        <td><form action="cart" method="post">
                <input type="hidden" name="abbr" value="SUPR">
                <input type="submit" value="Add To Cart">
            </form></td>
    </tr>
</table>
        
</body>
</html>
