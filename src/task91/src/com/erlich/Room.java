package com.erlich;

import java.awt.print.Book;

public class Room {
    private int ammountOfWalls;
    private BookShelf bookShelf;
    private Bad bad;
    private Desk desk;

    public Room (BookShelf bookShelf, Bad bad, Desk desk) {
        this.ammountOfWalls = 4;
        this.bookShelf = bookShelf;
        this.bad = bad;
        this.desk = desk;
    }
    public void rak() {
        System.out.println("RAK");
    }
    public BookShelf getBookShelf() {
        return bookShelf;
    }
}
