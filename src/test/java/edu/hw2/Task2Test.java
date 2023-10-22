package edu.hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {
    @Test
    @DisplayName("rectangles")
    void rectangleArea() {
        Task2.Rectangle rect = new Task2.Rectangle(11, 8);
        rect.setWidth(20);
        rect.setHeight(10);

        assertThat(rect.area()).isEqualTo(200.0);
    }

    @Test
    @DisplayName("squares1")
    void squareArea1() {
        Task2.Square square = new Task2.Square(11);
        square.setHeight(30);

        assertThat(square.area()).isEqualTo(900.0);
    }

    @Test
    @DisplayName("squares2")
    void squareArea2() {
        Task2.Square square = new Task2.Square(110);
        square.setWidth(10);

        assertThat(square.area()).isEqualTo(100.0);
    }
}
