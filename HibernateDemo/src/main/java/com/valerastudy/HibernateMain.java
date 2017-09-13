package com.valerastudy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class HibernateMain {
    public static void main(String[] args) {
        Book book1 = new Book("Cartea 1", "Autor 1", 11);
        Book book2 = new Book("Cartea 2", "Autor 2", 11);
        Book book3 = new Book("Cartea 3", "Autor 3", 11);
        Book book4 = new Book("Cartea 4", "Autor 4", 11);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(book3);
        session.save(book4);
        session.save(book1);
        session.save(book2);
        session.getTransaction().commit();

        Book loadedBook = session.load(Book.class, book1.getId());
        System.out.println(loadedBook.toString());
        loadedBook = session.load(Book.class, book2.getId());
        System.out.println(loadedBook.toString());
        loadedBook = session.load(Book.class, book3.getId());
        System.out.println(loadedBook.toString());
        loadedBook = session.load(Book.class, book4.getId());
        System.out.println(loadedBook.toString());

        List<Book> list = session.createQuery("FROM Book Order By name").list();
        for (Book book : list) {
            System.out.println(book.toString());
        }

        session.close();
        sessionFactory.close();
    }
}
