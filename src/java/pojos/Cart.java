//Jacob Li
//Hw3
//this is the cart object.  It holds an array of BookStack
//it uses the ArrayList which allows dynamic arrays that can be added and removed from easily.
package pojos;

import java.io.Serializable;
import java.util.ArrayList;


public class Cart implements Serializable {
    
    private ArrayList<BookStack> stackArray;
    private double totalAmount;
    
    public Cart(){
        stackArray = new ArrayList<BookStack>();
    }
    
    public ArrayList<BookStack> getStackArray() {
        return stackArray;
    }

    public int getSize() {
        return stackArray.size();
    }
    
    public double getTotalAmount(){                 //returns the total amount of all the books combined
        double total=0;
        for(BookStack book: stackArray){
            double x=0;
            double y =0;
            x=book.getTotal();
            y=total;
            total=y+x;
        }
        return total;
    }
    


    public void addBook(BookStack item) {
        String abbr = item.getBook().getAbbr();
        int quantity = item.getAmount();
        for (int i = 0; i < stackArray.size(); i++) {
            BookStack bookStack = stackArray.get(i);
            if (bookStack.getBook().getAbbr().equals(abbr)) {
                bookStack.setAmount(quantity);
                return;
            }
        }
        stackArray.add(item);
    }

    public void removeBook(BookStack item) {
        String abbr = item.getBook().getAbbr();
        for (int i = 0; i < stackArray.size(); i++) {
            BookStack bookStack = stackArray.get(i);
            if (bookStack.getBook().getAbbr().equals(abbr)) {
                stackArray.remove(i);
                return;
            }
        }
    }
   
}
