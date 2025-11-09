package byt.assignment.calculator;

public class Calculator {
    private final double a;
    private final double b;
    private final char operation;

    public Calculator(double a, double b, char operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        return switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) throw new ArithmeticException("Can't divide by zero");
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        };
    }
}
