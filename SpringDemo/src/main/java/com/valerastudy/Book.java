package com.valerastudy;

public class Book {
    private String name;
    private String author;
    private int nrPages;

    public Book() {
    }

    public Book(String name, String author, int nrPages) {
        this.name = name;
        this.author = author;
        this.nrPages = nrPages;
    }

    @Override
    public String toString() {
        return "Denumire: " + getName() + ", Autor: " + getAuthor() + ", Pagini: " + getNrPages();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNrPages() {
        return nrPages;
    }

    public void setNrPages(int nrPages) {
        this.nrPages = nrPages;
    }


}
