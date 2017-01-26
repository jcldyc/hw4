//Jacob Li
//Hw 3

//this is a book object.  Holds the name, price, url, and the abbreviation for the book
package pojos;

import java.io.Serializable;
import java.text.NumberFormat;

public class Book implements Serializable {
    
    private String abbr;
    private String name;
    private double price;
    private String imgUrl;

    public Book() {
        abbr = "";
        name = "";
        price = 0;
        imgUrl = "";
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    public void setUrl(String url){
        this.imgUrl = url;
    }
    public String getUrl(){
        return this.imgUrl;
    }

    public String getPriceCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    
}

