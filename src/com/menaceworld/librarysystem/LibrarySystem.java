package com.menaceworld.librarysystem;
import java.awt.print.Book;
import java.util.ArrayList;
public class LibrarySystem {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("book added!" + book);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("no books in the Library!");
        } else {
            System.out.println("Book's in the Library");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isBorrowed()) {
                    book.setBorrowed(true);
                    System.out.println("book borrowed: " + book);
                } else {
                    System.out.println("book already borrowed!!!");
                }
                return;
            }
        }
        System.out.println("book not found!!!");
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        library.addBook("The Alchemist", "Paulo Coehlo");
        library.addBook("Steal Like An Artist", "Austin Kleon");
        library.addBook("Effective Java", "Joshua Bloch");
        library.addBook("Think And Grow Rich", "Napoleon Hill");
        library.addBook("The Intelligent Investor", "Benjamin Graham");
        library.listBooks();
        library.borrowBook("effective java");
//        borrow again and output
    }
}