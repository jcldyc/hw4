//Jacob Li
//HW3
//this is the ReadIn object.  It returns the book information from the text file by
//reading in the text file and using a tokenizer to break it apart.
//It can return a single book or multiple books at a time.  
package readIn;

import java.io.*;
import java.util.*;

import pojos.*;

public class ReadIn {

    public static Book getBook(String abbr, String textFile) {          //takes in the books abbr and the book text file
        try {
            File file = new File(textFile);                     
            BufferedReader in
                    = new BufferedReader(
                            new FileReader(file));

            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");     //determines what to use as the tokeniser
                String productCode = t.nextToken();
                if (abbr.equalsIgnoreCase(productCode)) {               //ignores the book abbr after it matches, sets tokenizer to next string
                    String name = t.nextToken();
                    double price = Double.parseDouble(t.nextToken());   
                    String url = t.nextToken();
                    Book loki = new Book();
                    loki.setAbbr(abbr);
                    loki.setName(name);
                    loki.setPrice(price);
                    loki.setUrl(url);
                    in.close();
                    return loki;
                }
                line = in.readLine();
            }
            in.close();
            return null;
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }

    public static ArrayList<Book> getBooks(String filepath) {
        ArrayList<Book> books = new ArrayList<Book>();
        File file = new File(filepath);
        try {
            BufferedReader in
                    = new BufferedReader(
                            new FileReader(file));

            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                String abbr = t.nextToken();
                String name = t.nextToken();
                String priceAsString = t.nextToken();
                double price = Double.parseDouble(priceAsString);
                String url = t.nextToken();
                Book thor = new Book();
                thor.setAbbr(abbr);
                thor.setName(name);
                thor.setPrice(price);
                thor.setUrl(url);
                books.add(thor);
                line = in.readLine();
            }
            in.close();
            return books;
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }
}

