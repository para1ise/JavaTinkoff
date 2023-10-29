package edu.hw2;

public final class Rectangle extends Task2.Polygon {
    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    void setWidth(int width) {
        this.width = width;
    }

    @Override
    void setHeight(int height) {
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}
