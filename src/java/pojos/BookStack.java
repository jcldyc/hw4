//Jacob Li
//HW3
//This is BookStack object.  It holds a stack of 1 or greater of the same book. 
//It allows the program to hold a cart with a stack of different books.  
package pojos;

import java.io.Serializable;
import java.text.NumberFormat;


public class BookStack implements Serializable {
    
    private Book book;
    private int amount;
    
    public BookStack() {}
    
    public void setBook( Book book){
        this.book = book;
    }
    
    public Book getBook(){
        return this.book;
    }
    
    public void setAmount(int amount){
        this.amount = amount;
    }
    
    public int getAmount(){
        return this.amount;
    }
    
    public double getTotal() {
        double total = book.getPrice() * amount;
        return total;
    }

    public String getTotalCurrencyFormat() {                        //changes the amount in the text file
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //to a currency format
        return currency.format(this.getTotal());
    }
    
}

