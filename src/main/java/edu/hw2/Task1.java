package edu.hw2;

public class Task1 {
    public sealed interface Expr {
        double evaluate();

        record Constant(int number) implements Expr {
            @Override
            public double evaluate() {
                return number;
            }
        }

        record Negate(Expr variable) implements Expr {
            @Override
            public double evaluate() {
                return -variable.evaluate();
            }
        }

        record Exponent(Expr variable1, int exponent) implements Expr {
            @Override
            public double evaluate() {
                return Math.pow(variable1.evaluate(), exponent);
            }
        }

        record Addition(Expr variable1, Expr variable2) implements Expr {
            @Override
            public double evaluate() {
                return variable1.evaluate() + variable2.evaluate();
            }
        }

        record Multiplication(Expr variable1, Expr variable2) implements Expr {
            @Override
            public double evaluate() {
                return variable1.evaluate() * variable2.evaluate();
            }
        }
    }
}
