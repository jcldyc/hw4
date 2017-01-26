//Jacob Li
//Hw 4
//This is a User class to hold user info

//figure out what needs to  be done with password?

package pojos;

import java.io.Serializable;

public class User implements Serializable {

    private String email;
    private String firstName;
    private String lastName;
    private String password;

    public User() {
        email = "";
        firstName = "";
        lastName = "";
    }

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
    public User(String email, String password) {
        this.password = password;
        this.email = email;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}