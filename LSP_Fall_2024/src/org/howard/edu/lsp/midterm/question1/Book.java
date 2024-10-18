package org.howard.edu.lsp.midterm.question1;

public class Book {
	// book details that are private so no one edits
    private String title;
    private String author;
    private String isbn;
    private int yearPublished;
// creating a new book object
    public Book(String title, String author, String isbn, int yearPublished) {
        // book details for when it is created
    	this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.yearPublished = yearPublished;
    }
    // ability to get the book details
    public String getTitle() {
        return title;
    }
    // ability to change book details
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    // check if two books are the same
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return isbn.equals(book.isbn) && author.equals(book.author);
    }
    // string description of the book
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Year Published: " + yearPublished;
    }
}


