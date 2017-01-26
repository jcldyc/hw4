//Jacob Li
//HW 4
//This is the servlet page that handles request from cart.jsp, index.jsp, and checkout.jsp
package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import readIn.*;
import pojos.*;

public class cartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        ServletContext hub = getServletContext();
        
        
        String action = request.getParameter("action");     //checks for action parameter
        if (action == null) {
            action = "cart";                                //sets action to default "cart"
        }

                                            
        String url = "/index.jsp";                          //sets the url 
        if (action.equals("shop")) {
            url = "/index.jsp";    
        } 
        else if (action.equals("cart")) {                           //gets the data for the book code and
            String abbr = request.getParameter("abbr");             //amount the user wants to update with
            String amount = request.getParameter("quantity");

            HttpSession session = request.getSession();                 //request the session object
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
            }

            
            int quantity;
            try {
                quantity = Integer.parseInt(amount);                    //checks to make sure the user inputs a valid number
                if (quantity < 0) {
                    quantity = 1;
                }
            } catch (NumberFormatException nfe) {
                quantity = 1;
            }

            String textFile = hub.getRealPath("/WEB-INF/books.txt");    //tet file holding all the book info
            Book book = ReadIn.getBook(abbr, textFile);

            BookStack bookStack = new BookStack();
            bookStack.setBook(book);
            bookStack.setAmount(quantity);
            if (quantity > 0) {
                cart.addBook(bookStack);
            } else if (quantity == 0) {
                cart.removeBook(bookStack);
            }

            session.setAttribute("cart", cart);
            url = "/cart.jsp";
        }
        else if (action.equals("checkout")) {
            url = "/signIn.jsp";
        }

        hub.getRequestDispatcher(url)
                .forward(request, response);
    }
}


