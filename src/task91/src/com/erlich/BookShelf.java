package com.erlich;

public class BookShelf {
    private int howMuchCanItHold;
    private Dimension dimensions;
    private int ammountOfBooks;
    public BookShelf(int howMuchCanItHold, Dimension dimensions) {
        this.howMuchCanItHold = howMuchCanItHold < 0 ? 0 : howMuchCanItHold;
        this.dimensions = dimensions;
    }

    public int HowManyBooksDoesItHave() {
        return ammountOfBooks = (int)(Math.random() * 51) + 1;
    }

}
