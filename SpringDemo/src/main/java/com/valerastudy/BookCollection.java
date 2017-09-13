package com.valerastudy;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class BookCollection {
    @Autowired
//    @Qualifier("books")
    private List<Book> books;

    @Autowired
    private Book megaBook;

    public BookCollection() {
        this.books = new ArrayList();
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public void removeByName(String name) {
        List<Book> books2 = new ArrayList<Book>(this.books);
        for (int i = 0; i < books2.size(); i++) {
            Book book = books2.get(i);
            if (book.getName().equals(name)) {
                this.books.remove(book);
            }
        }

    }



    public void print() {
        for (Book book : this.books) {
            System.out.println(book);
        }
        System.out.println("Megabook:" + this.megaBook);
    }

    public Book getMegaBook() {
        return megaBook;
    }

    public void setMegaBook(Book megaBook) {
        this.megaBook = megaBook;
    }

    public List<Book> getBooks() {
        return books;
    }


    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
