package com.erlich;


public class Dimension {
    private int width;
    private int height;

    public Dimension(int width, int height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

}
