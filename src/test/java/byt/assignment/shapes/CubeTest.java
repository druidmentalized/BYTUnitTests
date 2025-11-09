package byt.assignment.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CubeTest {
    private final IShape cube = new Cube(7);

    @Test
    void calculateArea_shouldReturnExpectedValue() {
        var area = cube.calculateArea();
        assertEquals(294, area, 0.001);
    }

    @Test
    void calculateVolume_shouldReturnExpectedValue() {
        var volume = cube.calculateVolume();
        assertEquals(343, volume, 0.001);
    }
}
