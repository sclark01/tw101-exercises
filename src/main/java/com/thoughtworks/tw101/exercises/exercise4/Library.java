package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public String printBooksContaining(String partialBookTitle) {
        int len = books.length;
        String book;
        for (int i = 0; i < len; i++) {
            book = books[i].toLowerCase();
            if(book.contains(partialBookTitle.toLowerCase())){
                printStream.println(books[i]);
            }
        }
        return null;
    }
}
