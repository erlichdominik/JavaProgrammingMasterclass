package com.erlich;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(new BookShelf(200,new Dimension(200,400)),new Bad(new Dimension(300,400),300,true),new Desk("Dark Wood",new Dimension(400,700)));
        System.out.println(room.getBookShelf().HowManyBooksDoesItHave());
    }
}
