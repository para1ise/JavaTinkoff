package edu.hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    @DisplayName("rectangles1")
    void rectangleArea1() {
        Rectangle rect = new Rectangle(11, 8);
        rect.setWidth(20);
        rect.setHeight(10);

        assertThat(rect.area()).isEqualTo(200.0);
    }

    @Test
    @DisplayName("rectangles2")
    void rectangleArea2() {
        Rectangle rect = new Rectangle(0, 0);
        rect.setWidth(0);
        rect.setHeight(1);

        assertThat(rect.area()).isEqualTo(0);
    }

    @Test
    @DisplayName("rectangles3")
    void rectangleArea3() {
        Rectangle rect = new Rectangle(9, 6);
        rect.setWidth(0);

        assertThat(rect.area()).isEqualTo(0);
    }

    @Test
    @DisplayName("squares1")
    void squareArea1() {
        Square square = new Square(11);
        square.setHeight(30);

        assertThat(square.area()).isEqualTo(900.0);
    }

    @Test
    @DisplayName("squares2")
    void squareArea2() {
        Square square = new Square(110);
        square.setWidth(10);

        assertThat(square.area()).isEqualTo(100.0);
    }

    @Test
    @DisplayName("squares3")
    void squareArea3() {
        Square square = new Square(110);

        assertThat(square.area()).isEqualTo(110 * 110);
    }

    @Test
    @DisplayName("squares4")
    void squareArea4() {
        Square square = new Square(0);

        assertThat(square.area()).isEqualTo(0);
    }
}
