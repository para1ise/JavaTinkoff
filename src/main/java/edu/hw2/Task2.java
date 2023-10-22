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

    public static final class Rectangle extends Polygon {
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

    public static final class Square extends Polygon {
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
}
