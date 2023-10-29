package edu.hw2;

public final class Square extends Task2.Polygon {
    public Square(int width) {
        super(width, width);
    }

    @Override
    void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    void setHeight(int height) {
        this.width = height;
        this.height = height;
    }

    @Override
    double area() {
        return width * width;
    }
}
