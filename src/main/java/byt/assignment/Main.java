import byt.assignment.calculator.Calculator;
import byt.assignment.shapes.*;

void main() {
    showShapesBehaviour();
    printDivisor();
    showCalculatorBehaviour();
}

void printDivisor() {
    IO.println();
    IO.println("---------------------------------------------------------------");
    IO.println();
}

void showShapesBehaviour() {
    IShape sphere = new Sphere(5);
    IO.println("Sphere:");
    IO.println("Area: " + String.format("%.3f", sphere.calculateArea()));
    IO.println("Volume: " + String.format("%.3f", sphere.calculateVolume()));
    IO.println();

    IShape cylinder = new Cylinder(3, 7);
    IO.println("Cylinder:");
    IO.println("Area: " + String.format("%.3f", cylinder.calculateArea()));
    IO.println("Volume: " + String.format("%.3f", cylinder.calculateVolume()));
    IO.println();

    IShape rectangle = new Rectangle(4, 8);
    IO.println("Rectangle:");
    IO.println("Area: " + String.format("%.3f", rectangle.calculateArea()));
    IO.println("Volume: " + String.format("%.3f", rectangle.calculateVolume()));
    IO.println();

    IShape cube = new Cube(4);
    IO.println("Cube:");
    IO.println("Area: " + String.format("%.3f", cube.calculateArea()));
    IO.println("Volume: " + String.format("%.3f", cube.calculateVolume()));
}

void showCalculatorBehaviour() {
    var a = 6;
    var b = 7;

    List.of('+', '-', '*', '/').forEach(c -> {
        try {
            var calc = new Calculator(a, b, c);
            IO.println("Result: " + calc.calculate());
        } catch (Exception e) {
            IO.println("Error: " + e.getMessage());
        }
    });
}