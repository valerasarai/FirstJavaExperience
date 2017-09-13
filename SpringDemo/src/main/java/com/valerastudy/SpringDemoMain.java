package com.valerastudy;

import javafx.beans.property.ListPropertyBase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Book megaBook = (Book) context.getBean("megaBook");

        BookCollection bookCollection = (BookCollection) context.getBean("bookCollection");
//        BookCollection bookCollection = new BookCollection();
//        bookCollection = readAllBooks(context, bookCollection);
//        bookCollection.setMegaBook(megaBook);
        bookCollection.print();

    }

    private static BookCollection readAllBooks(ApplicationContext context, BookCollection bookCollection) {
        bookCollection.add((Book) context.getBean("book1"));
        bookCollection.add((Book) context.getBean("book2"));
        bookCollection.add((Book) context.getBean("book3"));
        bookCollection.add((Book) context.getBean("book4"));
        bookCollection.add((Book) context.getBean("book5"));
        return bookCollection;
    }

    private static void generateBooks(BookCollection bookCollection) {

        for (int i = 0; i < 10; i++) {
            bookCollection.add(new Book("Cartea " + i, "Autorul " + i, 10 * i));
        }
    }
}
