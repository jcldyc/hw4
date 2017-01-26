//Jacob Li
//HW 4
package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import pojos.User;
import dB.UserDB;

public class dBServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/signIn.html";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "default";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("default")) {
            url = "/signIn.jsp";    // the "Sign In" page
        } 
        else if (action.equals("signIn")) {
            // get parameters from the request
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            // store data in User object
            User user = new User(email, password);

            // validate the parameters
            String message;
            message = "";
            if (UserDB.emailExists(user.getEmail())) { 
                if(UserDB.correctPassword(user.getPassword())){
                    url="/thanks.jsp";
                }
                else{
                    message="Sorry but the password you entered was incorrect.  Please try again.";
                    url="/signIn.jsp";
                }
            }
            else {              //else if email exists but password is incorrect send back to sign in 
                url = "/newUser.jsp";
            }
            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
        else if(action.equals("newUser")){
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            User user = new User(firstName, lastName, email, password);
            UserDB.insert(user);
            url = "/thanks.jsp";
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }    
}
