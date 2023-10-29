package edu.hw2;

public class Task2 {
    private Task2() {
    }

    abstract static class Polygon {
        protected int width;
        protected int height;

        Polygon(int width, int height) {
            this.height = height;
            this.width = width;
        }

        abstract void setWidth(int width);

        abstract void setHeight(int height);

        abstract double area();
    }
}
