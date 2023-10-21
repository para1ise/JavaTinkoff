package edu.hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("Фильтрация корректных данных")
    void filterCorrectData() {
        var two = new Task1.Expr.Constant(2);
        var four = new Task1.Expr.Constant(4);
        var negOne = new Task1.Expr.Negate(new Task1.Expr.Constant(1));
        var sumTwoFour = new Task1.Expr.Addition(two, four);
        var mul = new Task1.Expr.Multiplication(sumTwoFour, negOne);
        var exp = new Task1.Expr.Exponent(mul, 2);
        var res = new Task1.Expr.Addition(exp, new Task1.Expr.Constant(1));

        assertThat(new double[] {negOne.evaluate(), sumTwoFour.evaluate(), mul.evaluate(), exp.evaluate(),
            res.evaluate()}).isEqualTo(new double[] {-1, 6, -6, 36, 37});
    }
}

