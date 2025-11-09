package byt.assignment.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    private final IShape rectangle = new Rectangle(6, 7);

    @Test
    void calculateArea_shouldReturnExpectedValue() {
        var area = rectangle.calculateArea();
        assertEquals(42, area, 0.001);
    }

    @Test
    void calculateVolume_shouldReturnExpectedValue() {
        var volume = rectangle.calculateVolume();
        assertEquals(0, volume, 0);
    }
}
