package org.howard.edu.lsp.midterm.question1;

public class BookDriver {
    public static void main(String[] args) {
    	// created three book objects to make test cases
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // should print out true 
        System.out.println(book1.equals(book2));
        // should print out false
        System.out.println(book1.equals(book3));
        // should print out book info
        System.out.println(book1); 
    }
}
